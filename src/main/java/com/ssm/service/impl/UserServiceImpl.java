package com.ssm.service.impl;


import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    //用户展示方法
    @Override
    public List<User> get_List() {
        return userDao.get_List();
    }

    @Override
    public List<User> get_LikeList(String content) {
        return userDao.get_LikeList(content);
    }

    @Override
    public void insert_Info(User user) {
        userDao.insert_Info(user);
    }

    @Override
    public User get_Info(Integer id) {
        return userDao.get_Info(id);
    }

    @Override
    public void update_Info(User user) {
        userDao.update_Info(user);
    }

    @Override
    public void delete_Info(Integer id) {
        userDao.delete_Info(id);
    }

    @Override
    public boolean findByNamePwd(String username, String password) {
        User user = userDao.findByNamePwd(username, password);
        if (user == null) {
            return false;
        }
        return true;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void byIdDelUser(Integer id) {
        userDao.byIdDelUser(id);
    }

    @Override
    public User byIdFindUser(Integer id) {
        return userDao.byIdFindUser(id);
    }

    @Override
    public User byUsernameFindUser(String username) {
        return userDao.byUsernameFindUser(username);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
