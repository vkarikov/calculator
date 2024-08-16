package ru.vkarikov.calculator.process.service.impl.steps;

import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;
import ru.vkarikov.calculator.process.entity.StepResult;

import java.util.function.Function;

public interface CalculationFunctionHolder {
    Function<PrimaryValidatedRequest, StepResult> get();
}
