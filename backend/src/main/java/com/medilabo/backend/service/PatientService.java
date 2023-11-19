package com.medilabo.backend.service;

import com.medilabo.backend.model.Patient;
import com.medilabo.backend.repository.PatientRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LogManager.getLogger("PatientService");

    @Autowired
    PatientRepository patientRepository;

    /**
     * Methode for create a new patient
     * @param firstname
     * @param lastname
     * @param birthdate
     * @param gender
     * @param address
     * @param phone
     * @return new patient
     */
    public Patient addPatient(String firstname, String lastname, String birthdate, String gender, String address, String phone) {
        Date birthdateFormated = this.formateBirthdate(birthdate);
        Patient patient = new Patient(firstname,lastname,birthdateFormated,gender,address,phone);
        if (patient.isValid()) {
            return patientRepository.save(patient);
        } else {
            return null;
        }
    }

    /**
     * Method for formate a String date given to a java Date
     * @param birthdate
     * @return a Date
     * The given date must be on format : "dd/MM/YYYY"
     */
    private Date formateBirthdate(String birthdate) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
            return date;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Methode for get patient by an id given
     * @param patientId
     * @return Patient
     */
    public Patient getPatientById(int patientId) {
        try {
            return patientRepository.findById(patientId).orElseThrow();
        } catch (NoSuchElementException noSuchElementException){
            logger.error(noSuchElementException.getMessage());
            return null;
        }
    }



    public Optional<Patient> getPatientByLastnameAndFirstnameAndBirthdate(String lastname, String firstname, String birthdate) {
        return patientRepository.findByFirstnameAndLastnameAndBirthdate(lastname,firstname,this.formateBirthdate(birthdate));
    }
}
