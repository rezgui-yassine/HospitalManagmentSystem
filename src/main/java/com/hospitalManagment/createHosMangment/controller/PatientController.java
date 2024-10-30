package com.hospitalManagment.createHosMangment.controller;


import com.hospitalManagment.createHosMangment.model.entity.Patients;
import com.hospitalManagment.createHosMangment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/getPatientById")
    public Patients getPatientById(@RequestParam Integer id) {
        return patientService.getPatientById(id);
    }


}
