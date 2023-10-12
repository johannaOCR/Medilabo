package com.medilabo.backend.service;

import com.medilabo.backend.model.Patient;
import com.medilabo.backend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientByName(String firstName, String lastName) {
        return patientRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.getReferenceById(id);
    }

    public Patient updatePatient(Long id, Patient patient) {
        Patient patient1 =  patientRepository.getReferenceById(id);
        patient1 = patient;
        patientRepository.save(patient1);
        return patient1;
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
