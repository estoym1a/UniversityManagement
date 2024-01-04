package com.changeside.project1.service;

import com.changeside.project1.entity.Address;
import com.changeside.project1.entity.Group;

import java.util.List;

public interface GroupService {
    List<Group> getAll();
    Group getById(int id);

    void create(Group group);

}

