package com.noelle.java_patient_service.dto.mapper;

import org.springframework.stereotype.Component;

import com.noelle.java_patient_service.dto.PatientResponseDto;
import com.noelle.java_patient_service.model.Patient;

@Component
public class PatientMapper {
    
    public PatientResponseDto toDto(Patient patient) {
        if (patient == null) {
            return null;
        }
        return new PatientResponseDto(
            patient.getId(),
            patient.getName(),
            patient.getEmail(),
            patient.getAddress(),
            patient.getDateOfBirth(),
            patient.getRegisteredDate()
        );
    }

    public Patient toEntity(PatientResponseDto patientResponseDto) {
        if (patientResponseDto == null) {
            return null;
        }

        Patient patient = new Patient();
        if (patientResponseDto.id() != null) {
            patient.setId(patientResponseDto.id());
        }   

        patient.setName(patientResponseDto.name());
        patient.setEmail(patientResponseDto.email());
        patient.setAddress(patientResponseDto.address());   
        patient.setDateOfBirth(patientResponseDto.dateOfBirth());
        patient.setRegisteredDate(patientResponseDto.registeredDate());
        return patient;
    }
}
