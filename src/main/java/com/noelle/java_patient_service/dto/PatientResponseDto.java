package com.noelle.java_patient_service.dto;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record PatientResponseDto(
    
    UUID id,

    @NotNull String name,

    @NotNull String email,

    @NotNull String address,

    @NotNull LocalDate dateOfBirth,

    @NotNull LocalDate registeredDate

) {
    
}
