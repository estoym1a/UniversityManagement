package com.changeside.project1.manager;

import com.changeside.project1.entity.Faculty;
import com.changeside.project1.repository.FacultyRepository;
import com.changeside.project1.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class FacultyManager implements FacultyService {
    private final FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getAll() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty getById(int id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public void create(Faculty faculty) {
        facultyRepository.save(faculty);

    }
}
