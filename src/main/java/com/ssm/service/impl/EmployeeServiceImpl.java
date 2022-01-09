package com.ssm.service.impl;

import com.ssm.dao.DeptDao;
import com.ssm.dao.EmployeeDao;
import com.ssm.model.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private DeptDao deptDao;

    @Override
    public List<Employee> findEmpList() {
        return employeeDao.findEmpList();
    }

    @Override
    public void ByIdDelEmployee(Integer id) {
        employeeDao.ByIdDelEmployee(id);
    }
}
