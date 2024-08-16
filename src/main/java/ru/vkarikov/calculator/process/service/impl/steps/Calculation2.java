package ru.vkarikov.calculator.process.service.impl.steps;

import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;
import ru.vkarikov.calculator.process.entity.StepResult;

import java.util.function.Function;

public final class Calculation2 implements CalculationFunctionHolder {
    @Override
    public Function<PrimaryValidatedRequest, StepResult> get() {
        return (PrimaryValidatedRequest r) -> new StepResult();
    }
}
