package com.medilabo.backend.controller;

import com.medilabo.backend.service.PatientService;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class PatientController {
    private static final Logger logger = LogManager.getLogger("PatientController");


    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public String savePatient(@RequestParam(name = "firstname") String firstname,
            @RequestParam(name = "lastname") String lastname,
            @RequestParam(name = "birthdate") String birthdate,
            @RequestParam(name = "gender") String gender,
            @RequestParam(name = "address") String address,
            @RequestParam(name = "phone") String phone) {
        logger.info("Trying to add a patient");
        patientService.addPatient(firstname, lastname, birthdate,gender,address,phone);
        return "redirect:/getPatient";
    }

    @GetMapping("/getPatientById")
    public String getPatient(@RequestParam(name = "patientId") int patientId) {
        patientService.getPatientById(patientId);
        return "redirect:/showPatient";
    }

    @GetMapping("/getPatientsByLastnameAndFirstnameAndBirthdate")
    public String getPatientsByLastnameAndFirstnameAndBirthdate(@RequestParam(name = "lastname") String lastname,
            @RequestParam(name = "firstname") String firstname,
            @RequestParam(name = "birthdate") String birthdate) {
        patientService.getPatientByLastnameAndFirstnameAndBirthdate(lastname,firstname,birthdate);
        return "redirect:/showPatient";
    }


    // GET all patients

    // POST patient


    //PUT patient


    //DELETE patient


    // DELETE All patient
}
