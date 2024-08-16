package ru.vkarikov.calculator.process.entity;

import org.junit.jupiter.api.Test;
import ru.vkarikov.calculator.process.constants.CalculationError;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculationResultTest {

    @Test
    void getErrors() {
        CalculationResult cr = new CalculationResult();
        ArrayList<CalculationError> objects = new ArrayList<>();
        objects.add(CalculationError.ERROR1);
        cr.setErrors(objects);
        List<CalculationError> errors = cr.getErrors();
        CalculationError calculationError = errors.get(0);
        calculationError = CalculationError.ERROR2;
        assertEquals(cr.getErrors().size(), 1);
    }
}