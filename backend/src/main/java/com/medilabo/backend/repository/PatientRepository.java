package com.medilabo.backend.repository;

import com.medilabo.backend.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository

public class PatientRepository implements CrudRepository<Patient, Integer> {

    @Override
    public <S extends Patient> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Patient> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Patient> findById(Integer integer) {
        return Optional.empty();
    }

    public Optional<Patient> findByFirstnameAndLastnameAndBirthdate(String firstname, String lastname, Date birthdate) {
        return Optional.empty();
    }
/*
    @Query(value = "select distinct * from patient where lastname=?1 and firstname=?2 and birthdate=?3", nativeQuery = true)
    List<Patient> findAllByWalletCreditorId(String firstname, String lastname, Date birthdate) ;
*/
    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Patient> findAll() {
        return null;
    }

    @Override
    public Iterable<Patient> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Patient entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Patient> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
