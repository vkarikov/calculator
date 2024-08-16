package ru.vkarikov.calculator.process.service;

import org.springframework.stereotype.Service;
import ru.vkarikov.calculator.process.constants.CalculationError;
import ru.vkarikov.calculator.process.service.impl.steps.errors.ErrorFormatter;
import ru.vkarikov.calculator.process.service.impl.steps.errors.ErrorFormatterImpl1;
import ru.vkarikov.calculator.process.service.impl.steps.errors.ErrorFormatterImpl2;

@Service
public class ErrorFormatterFactory {
    public ErrorFormatter getErrorFormatter(CalculationError calculationError) {
        return switch (calculationError) {
            case ERROR1 -> new ErrorFormatterImpl1();
            case ERROR2 -> new ErrorFormatterImpl2();
        };
    }
}
