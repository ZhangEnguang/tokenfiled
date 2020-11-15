package com.eplugger.mapper;

import com.eplugger.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
@Mapper
@Component("testMapper")
public interface TestMapper {
    int insert(Student student);
}
