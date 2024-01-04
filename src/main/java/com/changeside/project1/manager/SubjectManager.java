package com.changeside.project1.manager;

import com.changeside.project1.entity.Subject;
import com.changeside.project1.repository.SubjectRepository;
import com.changeside.project1.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectManager implements SubjectService {
    private final SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getById(int id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public void create(Subject subject) {
        subjectRepository.save(subject);

    }
}
