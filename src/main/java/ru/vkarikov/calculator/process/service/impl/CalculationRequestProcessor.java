package ru.vkarikov.calculator.process.service.impl;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.entity.Calculable;
import ru.vkarikov.calculator.process.entity.CalculationResult;
import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;
import ru.vkarikov.calculator.process.entity.StepResult;
import ru.vkarikov.calculator.process.service.impl.steps.CalculationCheckSteps;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculationRequestProcessor {

    private final CalculationValidator validator;
    private final CalculationResultAggregator aggregator;

    public CalculationRequestProcessor(CalculationValidator validator, CalculationResultAggregator aggregator) {
        this.validator = validator;
        this.aggregator = aggregator;
    }

    public CalculationResult processBySteps(Calculable calculable) {

        PrimaryValidatedRequest primaryValidatedRequest = validator.validate(calculable);

        List<StepResult> list = Arrays.stream(CalculationCheckSteps.values())
                .map(step -> processStep(step, primaryValidatedRequest)).toList();

        return aggregator.aggregateResult(list);

    }

    private StepResult processStep(CalculationCheckSteps step, PrimaryValidatedRequest primaryValidatedRequest) {
        return step.getHolder().get().apply(primaryValidatedRequest);
    }
}
