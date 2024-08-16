package ru.vkarikov.calculator.process.service.impl;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.entity.Calculable;
import ru.vkarikov.calculator.process.entity.PrimaryValidatedRequest;

@Service
public class CalculationValidator {
    public PrimaryValidatedRequest validate(Calculable calculable) {
        return new PrimaryValidatedRequest();
    }
}
