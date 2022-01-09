package com.ssm.service.impl;

import com.ssm.dao.DeptDao;
import com.ssm.model.Dept;
import com.ssm.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public List deptList() {
        return deptDao.selectAllDept();
    }

    @Override
    public void byIdDelDept(Integer id) {
        deptDao.byIdDelDept(id);
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.addDept(dept);
    }

    @Override
    public Dept byIdFindDept(Integer id) {
        return deptDao.byIdFindDept(id);
    }

    @Override
    public void updateDept(Dept dept) {
        deptDao.updateDept(dept);
    }
}
