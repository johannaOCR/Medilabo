package com.medilabo.backend.repository;

import com.medilabo.backend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByFirstNameAndLastName(String firstName, String lastName);
}
