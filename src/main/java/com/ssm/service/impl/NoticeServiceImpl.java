package com.ssm.service.impl;

import com.ssm.dao.NoticeDao;
import com.ssm.model.Notice;
import com.ssm.model.User;
import com.ssm.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeDao noticeDao;


    @Override
    public List<Notice> get_LikeList(String content) {
        return noticeDao.get_LikeList(content);
    }

    @Override
    public void insert_Info(Notice notice) {
        noticeDao.insert_Info(notice);
    }

    @Override
    public Notice get_Info(Integer id) {
        return noticeDao.get_Info(id);
    }

    @Override
    public void update_Info(Notice notice) {
        noticeDao.update_Info(notice);
    }

    @Override
    public void delete_Info(Integer id) {
        noticeDao.delete_Info(id);
    }

    @Override
    public List<Notice> findNoticeList() {
        return  noticeDao.findNoticeList();
    }

    @Override
    public void addNotice(Notice notice) {
        noticeDao.addNotice(notice);
    }

}
