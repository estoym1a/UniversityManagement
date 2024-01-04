package com.changeside.project1.manager;

import com.changeside.project1.entity.Group;
import com.changeside.project1.repository.GroupRepository;
import com.changeside.project1.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class GroupManager implements GroupService {
    private final GroupRepository groupRepository;

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group getById(int id) {
        return groupRepository.findById(id).get();
    }

    @Override
    public void create(Group group) {
        groupRepository.save(group);

    }
}
