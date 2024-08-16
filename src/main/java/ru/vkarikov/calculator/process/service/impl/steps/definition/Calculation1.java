package ru.vkarikov.calculator.process.service.impl.steps.definition;

import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;
import ru.vkarikov.calculator.process.entity.StepResult;

import java.util.function.Function;

public final class Calculation1 implements CalculationFunctionHolder {
    @Override
    public Function<PrimaryValidatedRequest, StepResult> getCalculationFunction() {
        return (PrimaryValidatedRequest r) -> new StepResult();
    }
}
