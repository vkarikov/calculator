package ru.vkarikov.calculator.process.entity;

import lombok.Getter;
import lombok.Setter;
import ru.vkarikov.calculator.process.constants.CalculationCheckStep;
import ru.vkarikov.calculator.process.constants.CalculationError;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class CalculationResult {
    private CalculationCheckStep checkStep;
    private List<CalculationError> errors;

    public List<CalculationError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public void setErrors(List<CalculationError> errors) {
        this.errors = Collections.unmodifiableList(errors);;
    }
}
