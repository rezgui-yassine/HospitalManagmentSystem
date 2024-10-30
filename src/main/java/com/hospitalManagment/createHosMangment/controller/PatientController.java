package com.hospitalManagment.createHosMangment.controller;


import com.hospitalManagment.createHosMangment.model.entity.Patients;
import com.hospitalManagment.createHosMangment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/patient")
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    // add new patient
    public Patients addPatient(@RequestBody Patients patients) {
        return patientService.addPatient(patients);
    }

    @GetMapping("/getPatientById/{id}")
    public Patients getPatientById(@PathVariable Integer id) {
        return patientService.getPatientById(id);
    }
    @DeleteMapping("/deletePatientById/{id}")
    public ResponseEntity<String> deletePatientById(@PathVariable Integer id){
        return ResponseEntity.ok(patientService.deletePatientById(id));
    }
    @PutMapping("/updatePatientById/{id}")
    public ResponseEntity <Patients> updatePatientById(@PathVariable Integer id ,@RequestBody Patients patients){
        return ResponseEntity.ok(patientService.updatePatientById(id,patients));
    }


}
