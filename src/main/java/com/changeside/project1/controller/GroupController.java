package com.changeside.project1.controller;

import com.changeside.project1.entity.Group;
import com.changeside.project1.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("group")
@RequiredArgsConstructor

public class GroupController {

    private final GroupService groupService;

    @GetMapping("groups")
    public List<Group> getAll() {
        return groupService.getAll();

    }

    @GetMapping("/{id}")
    public Group getById(@PathVariable int id) {
        return groupService.getById(id);

    }

    public void create(@RequestBody Group group) {
        groupService.create(group);
    }
}
