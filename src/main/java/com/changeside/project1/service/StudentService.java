package com.changeside.project1.service;

import com.changeside.project1.entity.Student;
import com.changeside.project1.repository.StudentRepository;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getById(int id);
    void create(Student student);
}
