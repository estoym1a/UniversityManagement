package com.changeside.project1.controller;

import com.changeside.project1.entity.Subject;
import com.changeside.project1.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("faculty")
@RequiredArgsConstructor

public class SubjectController {
    private final SubjectService subjectService;

    @GetMapping("subjects")
    public List<Subject> getAll() {
        return subjectService.getAll();
    }



    @GetMapping("/subject/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return subjectService.getById(id);
    }



        public void create(@RequestBody Subject subject) {
        subjectService.create(subject);
    }
}
