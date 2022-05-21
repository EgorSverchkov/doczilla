package com.example.doczilla.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StudentDto {
    private Long id;

    private String name;

    private String surname;

    private String patronymic;

    private Date birthday;

    private String group;
}
