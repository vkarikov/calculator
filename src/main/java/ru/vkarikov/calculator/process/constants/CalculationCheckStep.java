package ru.vkarikov.calculator.process.constants;

import lombok.Getter;

@Getter
public enum CalculationCheckStep {
    CHECK_STEP_A("description1"),
    CHECK_STEP_B("description2");

    private final String description;

    CalculationCheckStep(String description) {
        this.description = description;
    }
}
