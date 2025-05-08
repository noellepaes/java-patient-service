package com.noelle.java_patient_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noelle.java_patient_service.dto.PatientResponseDto;
import com.noelle.java_patient_service.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // @GetMapping
    // public ResponseEntity<List<PatientResponseDto>> getPaciets() {
    //     List<PatientResponseDto> patients = patientService.getPaciets();
    //     return ResponseEntity.ok().body(patients);
    // }
}
