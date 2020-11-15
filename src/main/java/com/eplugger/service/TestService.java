package com.eplugger.service;

import com.eplugger.entity.Student;
import com.eplugger.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper mapper;
    public boolean add(Student student) {
       return this.mapper.insert(student) != 0;
    }
}
