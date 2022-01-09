package com.ssm.dao;

import com.ssm.model.Dept;

import java.util.List;

public interface DeptDao {
    List<Dept> selectAllDept();

    void byIdDelDept(Integer id);

    void addDept(Dept dept);

    Dept byIdFindDept(Integer id);

    void updateDept(Dept dept);
}
