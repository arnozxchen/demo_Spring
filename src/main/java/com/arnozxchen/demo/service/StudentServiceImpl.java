package com.arnozxchen.demo.service;

import com.arnozxchen.demo.dao.Student;
import com.arnozxchen.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
