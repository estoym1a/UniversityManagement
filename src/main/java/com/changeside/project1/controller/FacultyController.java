package com.changeside.project1.controller;

import com.changeside.project1.entity.Faculty;
import com.changeside.project1.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("faculty")
@RequiredArgsConstructor

public class FacultyController {

    private final FacultyService facultyService;

    @GetMapping("faculties")
    public List<Faculty> getAll() {
        return facultyService.getAll();

    }

    @GetMapping("/{id}")
    public Faculty getById(@PathVariable int id) {
        return facultyService.getById(id);

    }

    public void create(@RequestBody Faculty faculty) {
        facultyService.create(faculty);
    }
}
