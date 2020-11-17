package com.eplugger.mapper;

import com.eplugger.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("testMapper")
public interface TestMapper {
    int insert(Student student);

    List<Student> search(String search);

    Integer delete(Integer id);

    Student selectById(Integer id);

    int updateById(Student student);
}
