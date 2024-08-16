package ru.vkarikov.calculator.process.entity;

import lombok.Data;

import java.util.Optional;

@Data
public class PrimaryValidatedRequest {

    private Statement fnsStatement;
    private ServiceError fnsServiceError;

    public Optional<Statement> getFnsStatement() {
        return Optional.of(fnsStatement);
    }
}
