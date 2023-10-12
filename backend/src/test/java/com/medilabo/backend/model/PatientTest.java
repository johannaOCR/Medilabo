package com.medilabo.backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    private Patient patient;

    @BeforeEach
    public void setUp() {
        patient = new Patient();
    }

    @Test
    public void testFirstName() {
        patient.setFirstName("John");
        assertEquals("John", patient.getFirstName());
    }

    @Test
    public void testLastName() {
        patient.setLastName("Doe");
        assertEquals("Doe", patient.getLastName());
    }

}
