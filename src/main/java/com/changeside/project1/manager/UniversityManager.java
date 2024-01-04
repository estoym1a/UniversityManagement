package com.changeside.project1.manager;

import com.changeside.project1.controller.UniversityController;
import com.changeside.project1.entity.University;
import com.changeside.project1.repository.UniversityRepository;
import com.changeside.project1.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UniversityManager implements UniversityService {
    private final UniversityRepository universityRepository;
    

    @Override
    public List<University> getAll() {
        return universityRepository.findAll();
    }

    @Override
    public University getById(int id) {
        return universityRepository.findById(id).get();
    }

    @Override
    public void create(University university) {
        universityRepository.save(university);

    }
}

