package ru.vkarikov.calculator.process.service.impl.steps;

import lombok.Getter;

@Getter
public enum CalculationCheckSteps {
    CHECK_STEP_A(new Calculation1()),
    CHECK_STEP_B(new Calculation2());

    private final CalculationFunctionHolder holder;

    CalculationCheckSteps(CalculationFunctionHolder holder) {
        this.holder = holder;
    }

}
