package com.hospitalManagment.createHosMangment.model.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "patients")
@Data

public class Patients {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "patient_sequence"
    )
    @SequenceGenerator(
            name="patient_sequence",
            sequenceName = "patient_sequence_id",
            allocationSize = 1
    )
    private Integer id;
    @Column(name = "first_name",
            nullable = false
    )
    private String firstname;
    @Column(name = "last_name",
            nullable = false)
    private String lastname;
    @Column(name = "email",
            nullable = false,
            unique = true
    )
    private String email;
    @Column(name = "password",
            nullable = false,
            length = 18
    )
    private String password;
    private Date dateOfBirth;
    @Column(name = "created_at",
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(name = "update_at",
           insertable = false
    )
    private LocalDateTime updatedAt;
    private String phone;
}
