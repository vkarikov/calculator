package ru.vkarikov.calculator.process.service;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.service.impl.steps.definition.Calculation1;
import ru.vkarikov.calculator.process.service.impl.steps.definition.Calculation2;
import ru.vkarikov.calculator.process.constants.CalculationCheckStep;
import ru.vkarikov.calculator.process.service.impl.steps.definition.CalculationFunctionHolder;

@Service
public class CalculationFactory {
    public CalculationFunctionHolder getCalculationFunctionHolder(CalculationCheckStep calculationCheckStep) {
        return switch (calculationCheckStep) {
            case CHECK_STEP_A -> new Calculation1();
            case CHECK_STEP_B -> new Calculation2();
        };
    }
}
