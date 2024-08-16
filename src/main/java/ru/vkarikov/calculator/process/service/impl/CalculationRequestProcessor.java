package ru.vkarikov.calculator.process.service.impl;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.entity.Calculable;
import ru.vkarikov.calculator.process.entity.CalculationResult;
import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;
import ru.vkarikov.calculator.process.entity.StepResult;
import ru.vkarikov.calculator.process.service.CalculationFactory;
import ru.vkarikov.calculator.process.constants.CalculationCheckStep;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculationRequestProcessor {

    private final CalculationValidator validator;
    private final CalculationResultAggregator aggregator;
    private final CalculationFactory calculationFactory;

    public CalculationRequestProcessor(CalculationValidator validator, CalculationResultAggregator aggregator, CalculationFactory calculationFactory) {
        this.validator = validator;
        this.aggregator = aggregator;
        this.calculationFactory = calculationFactory;
    }

    public CalculationResult processBySteps(Calculable calculable) {

        PrimaryValidatedRequest primaryValidatedRequest = validator.validate(calculable);

        List<StepResult> list = Arrays.stream(CalculationCheckStep.values())
                .map(step -> processStep(step, primaryValidatedRequest)).toList();

        return aggregator.aggregateResult(list);

    }

    private StepResult processStep(CalculationCheckStep step, PrimaryValidatedRequest primaryValidatedRequest) {
        return calculationFactory.getCalculationFunctionHolder(step).getCalculationFunction().apply(primaryValidatedRequest);
    }
}
