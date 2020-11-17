package com.eplugger.service;

import com.eplugger.entity.Student;
import com.eplugger.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper mapper;
    public boolean add(Student student) {
       return this.mapper.insert(student) != 0;
    }

    public List<Student> search(String search) {
        return this.mapper.search(search);
    }

    public boolean del(Integer id) {
        return this.mapper.delete(id) != 0;
    }

    public Student selectById(Integer id) {
        return this.mapper.selectById(id);
    }

    public boolean updateById(Student student) {
        return this.mapper.updateById(student) != 0;
    }
}
