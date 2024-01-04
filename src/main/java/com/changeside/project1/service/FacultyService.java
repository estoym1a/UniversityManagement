package com.changeside.project1.service;

import com.changeside.project1.entity.Address;
import com.changeside.project1.entity.Faculty;

import java.util.List;

public interface FacultyService {
    List<Faculty> getAll();
    Faculty getById(int id);

    void create(Faculty faculty);
}

