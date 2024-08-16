package ru.vkarikov.calculator.process.constants;

import lombok.Getter;

@Getter
public enum CalculationError {
    ERROR1("description1"),
    ERROR2("description2");

    private final String description;

    CalculationError(String description) {
        this.description = description;
    }

}
