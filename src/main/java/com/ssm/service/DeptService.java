package com.ssm.service;

import com.ssm.model.Dept;

import java.util.List;

public interface DeptService {


    List deptList();

    void byIdDelDept(Integer id);

    void addDept(Dept dept);

    Dept byIdFindDept(Integer id);

    void updateDept(Dept dept);
}
