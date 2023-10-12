package com.medilabo.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "postal_address")
    private String postalAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (!getId().equals(patient.getId())) return false;
        if (!getFirstName().equals(patient.getFirstName())) return false;
        if (!getLastName().equals(patient.getLastName())) return false;
        if (!getBirthDate().equals(patient.getBirthDate())) return false;
        if (!getGender().equals(patient.getGender())) return false;
        if (getPostalAddress() != null ? !getPostalAddress().equals(patient.getPostalAddress()) : patient.getPostalAddress() != null)
            return false;
        return getPhoneNumber() != null ? getPhoneNumber().equals(patient.getPhoneNumber()) : patient.getPhoneNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getBirthDate().hashCode();
        result = 31 * result + getGender().hashCode();
        result = 31 * result + (getPostalAddress() != null ? getPostalAddress().hashCode() : 0);
        result = 31 * result + (getPhoneNumber() != null ? getPhoneNumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

