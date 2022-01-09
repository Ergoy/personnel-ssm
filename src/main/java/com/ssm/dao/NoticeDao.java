package com.ssm.dao;

import com.ssm.model.Notice;
import com.ssm.model.User;

import java.util.List;

public interface NoticeDao {
    List<Notice> get_LikeList(String content);
    void insert_Info(Notice employee);
    Notice get_Info(Integer id);
    void update_Info(Notice employee);
    void delete_Info(Integer id);

    List<Notice> findNoticeList();

    void addNotice(Notice notice);
}
