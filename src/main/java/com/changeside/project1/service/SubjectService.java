package com.changeside.project1.service;

import com.changeside.project1.entity.Subject;
import com.changeside.project1.repository.SubjectRepository;

import java.util.List;

public interface SubjectService {
    List<Subject> getAll();
    Subject getById(int id);
    void create(Subject subject);


}
