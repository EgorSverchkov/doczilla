package com.example.doczilla.service;

import com.example.doczilla.model.dto.StudentDto;

public interface StudentService {
    void addStudent(StudentDto studentDto);
    void deleteStudent(Long id);
    void showAllStudent();
}
