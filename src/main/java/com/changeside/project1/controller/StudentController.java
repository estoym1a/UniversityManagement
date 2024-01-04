package com.changeside.project1.controller;

import com.changeside.project1.entity.Student;
import com.changeside.project1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class  StudentController {
    private final StudentService studentService;

    @GetMapping("students")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")

    public Student getById(@PathVariable int id) {
        return studentService.getById(id);
    }

    public void create(@RequestBody Student student) {
        studentService.create(student);
    }

}
