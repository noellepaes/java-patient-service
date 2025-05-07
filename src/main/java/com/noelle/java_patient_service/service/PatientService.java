package com.noelle.java_patient_service.service;

import com.noelle.java_patient_service.repository.PatientRepository;
import com.noelle.java_patient_service.dto.PatientResponseDto;
import com.noelle.java_patient_service.dto.mapper.PatientMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;



@Service
public class PatientService {

    private PatientRepository patientRepository;
    private PatientMapper patientMapper;

    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDto> list(){
        return patientRepository.findAll()
            .stream()
            .map(patientMapper::toDto)
            .collect(Collectors.toList());
    }
}
