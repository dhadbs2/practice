package com.exe.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentMapper {

    @Select("SELECT s.*, d.departmentName FROM student s LEFT JOIN department d ON s.departmentId = d.id")
    List<Student> findAll();

}