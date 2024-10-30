package com.hospitalManagment.createHosMangment.repository;

import com.hospitalManagment.createHosMangment.model.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patients,Integer> {


}
