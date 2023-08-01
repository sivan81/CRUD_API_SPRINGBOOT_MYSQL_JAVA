package com.example.CrudSpringBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data  //Agrega lombok (dependencia para no tener que agregar los get y los set, solo los parámetros)
@Entity //
@Table(name="tbl_student") //Crea la tabla con el nombre que deseemos
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    private String firstName;

    private String lastName;

    @Column(name="email_address",unique = true, nullable = false)
    private String email;
}
