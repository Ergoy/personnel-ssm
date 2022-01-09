package com.ssm.service;

import com.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {
    //用户展示方法
    List<User> get_List();
    List<User> get_LikeList(String content);
    void insert_Info(User user);
    User get_Info(Integer id);
    void update_Info(User user);
    void delete_Info(Integer id);
    //登录验证方法
    boolean findByNamePwd(String username,String password);

    void addUser(User user);

    void byIdDelUser(Integer id);

    User byIdFindUser(Integer id);

    User byUsernameFindUser(String username);

    void updateUser(User user);

}
