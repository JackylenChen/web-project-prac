package com.webproject.mapper;

import com.webproject.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    //获取所有的员工信息加上部门名
    List<Employee> getEmployees();

    int save(Employee employee);

    Employee get(Integer id);

    int delete(Integer id);

}
