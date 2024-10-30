package com.hospitalManagment.createHosMangment.repository;

import com.hospitalManagment.createHosMangment.model.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patients,Integer> {

    // get patient by name
    List<Patients> findByFirstname(String name);
}
