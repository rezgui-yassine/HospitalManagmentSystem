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
    // delete Patient by id
    public String deletePatientById(Integer id ){
      patientRepo.deleteById(id);
        return "Patient deleted successfully";
    }

    // update patient by id
     public Patients updatePatientById(Integer id , Patients patients){
        Patients existingPatient = patientRepo.findById(id).orElseThrow(()-> new RuntimeException("Patient not found"));

        existingPatient.setFirstname(patients.getFirstname());
        existingPatient.setLastname((patients.getLastname()));
        existingPatient.setEmail((patients.getEmail()));
        existingPatient.setPassword((patients.getPassword()));
        existingPatient.setDateOfBirth((patients.getDateOfBirth()));
        return patientRepo.save(existingPatient);
     }

     //get Patients by Name
    public List <Patients> getPatientsByName(String name){
        return patientRepo.findByFirstname(name);
    }



}
