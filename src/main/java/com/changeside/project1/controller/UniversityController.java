package com.changeside.project1.controller;

import com.changeside.project1.entity.University;
import com.changeside.project1.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("university")
@RequiredArgsConstructor
public class UniversityController {
    private final UniversityService universityService;

    @GetMapping("universities")
    public List<University> getAll() {
        return universityService.getAll();

    }

    @GetMapping("/{id}")
    public University getById(@PathVariable int id) {
        return universityService.getById(id);
    }


    public void create(@RequestBody University university) {
        universityService.create(university);
    }
}
