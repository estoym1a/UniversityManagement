package com.changeside.project1.service;

import com.changeside.project1.entity.University;
import com.changeside.project1.repository.UniversityRepository;

import java.util.List;

public interface UniversityService {
    List<University> getAll();
    University getById(int id);
    void create(University university);
}
