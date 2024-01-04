package com.changeside.project1.manager;

import com.changeside.project1.entity.Student;
import com.changeside.project1.repository.StudentRepository;
import com.changeside.project1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentManager implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);

    }
}
