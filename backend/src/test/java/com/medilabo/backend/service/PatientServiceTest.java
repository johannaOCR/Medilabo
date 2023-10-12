package com.medilabo.backend.service;

import com.medilabo.backend.model.Patient;
import com.medilabo.backend.repository.PatientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PatientServiceTest {

    @InjectMocks
    private PatientService patientService;

    @Mock
    private PatientRepository patientRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testGetPatientByName() {
        Patient mockPatient = new Patient();
        mockPatient.setFirstName("John");
        mockPatient.setLastName("Doe");

        when(patientRepository.findByFirstNameAndLastName("John", "Doe"))
                .thenReturn(Optional.of(mockPatient));

        Optional<Patient> result = patientService.getPatientByName("John", "Doe");
        verify(patientRepository, times(1)).findByFirstNameAndLastName("John", "Doe");

        assertEquals(mockPatient, result.orElse(null));
    }
}
