package com.webproject.mapper;

import com.webproject.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    //获取所有部门信息
    List<Department> getDepartments();
    //根据id获取部门信息
    Department getDepartmentById(Integer id);
}
