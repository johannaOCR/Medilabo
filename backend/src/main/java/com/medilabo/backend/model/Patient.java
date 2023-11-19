package com.medilabo.backend.model;

import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name="patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;

    public Patient( String firstname, String lastname, Date birthdate, String gender, String address, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patient_id) {
        this.patientId = patient_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String prenom) {
        this.firstname = prenom;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String nom) {
        this.lastname = nom;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date dateNaissance) {
        this.birthdate = dateNaissance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String genre) {
        this.gender = genre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adresse) {
        this.address = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String mobile) {
        this.phone = mobile;
    }

    public boolean isValid(){
        return this.firstname !=null && this.lastname !=null && this.birthdate !=null && this.gender !=null;
    }
}
