package com.hospitalManagment.createHosMangment.service;

import com.hospitalManagment.createHosMangment.model.entity.Patients;
import com.hospitalManagment.createHosMangment.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    // add new patient
  public Patients addPatient(Patients patients){
      return patientRepo.save(patients);

  }
  // get patient by id
public Patients getPatientById(Integer id){
      return patientRepo.findById(id).orElse(null);
}

// get all patients
    public List<Patients> getAllPatients(){
      return patientRepo.findAll();
    }
    // update patient



}
