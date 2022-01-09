package com.ssm.dao;

import com.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    List<User> get_List();
    List<User> get_LikeList(String content);
    User get_login(@Param("loginname") String loginname,@Param("password") String password);
    void insert_Info(User user);
    User get_Info(Integer id);
    void update_Info(User user);
    void delete_Info(Integer id);

    User findByNamePwd(String username, String password);

    void addUser(User user);

    void byIdDelUser(Integer id);

    User byIdFindUser(Integer id);

    void updateUser(User user);

    User byUsernameFindUser(String username);
}
