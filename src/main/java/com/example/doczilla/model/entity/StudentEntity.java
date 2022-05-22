package com.example.doczilla.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StudentEntity {
    @Id
    private Long id;

    private String name;

    private String surname;

    private String patronymic;

    private Date birthday;

    private String studyGroup;
}
