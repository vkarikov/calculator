package ru.vkarikov.calculator.process.entity;

import ru.vkarikov.calculator.process.constants.CalculationCheckStep;
import ru.vkarikov.calculator.process.constants.CalculationError;

import java.util.List;

public class CalculationResult {
    CalculationCheckStep checkStep;
    List<CalculationError> errors;
}
