package ru.vkarikov.calculator.process.service.impl;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.entity.CalculationResult;
import ru.vkarikov.calculator.process.entity.StepResult;

import java.util.List;

@Service
public class CalculationResultAggregator {
    public CalculationResult aggregateResult(List<StepResult> list) {
        return new CalculationResult();
    }
}
