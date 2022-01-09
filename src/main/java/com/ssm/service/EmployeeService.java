package com.ssm.service;

import com.ssm.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {

    List<Employee> findEmpList();

    void ByIdDelEmployee(Integer id);
}
