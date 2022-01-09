package com.ssm.controller;

import com.ssm.model.Notice;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import com.ssm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private IUserService userService;

    //公告展示
    @RequestMapping("list")
    public ModelAndView noticeList(){
        List<Notice> noticeList = noticeService.findNoticeList();
        System.out.println(noticeList);
        ModelAndView mv = new ModelAndView();
        mv.addObject("noticeList",noticeList);
        mv.setViewName("/notice/list");
        return mv;
    }

    //增加公告
    @RequestMapping("add")
    public String addNotice(@RequestParam("title")String title,@RequestParam("content")String content, HttpServletRequest request){
        //获取到公告信息
        String username = request.getParameter("username");
        System.out.println(username);
        //通过用户名去查找用户
        User user = userService.byUsernameFindUser(username);
        //获取当前时间并设置格式转换为字符串
        Date date =new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String date1 = df.format(date);
        Notice notice = new Notice(title,content,date1,user.getId(),user);
        noticeService.addNotice(notice);

        return "redirect:list";
    }
}
