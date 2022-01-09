package com.ssm.dao;

import com.ssm.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findEmpList();

    void ByIdDelEmployee(Integer id);
}
