package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import jdk.nashorn.internal.objects.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    //用户登录
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password,
                            HttpServletRequest request ) throws Exception {
        //获取前端用户输入的用户登录信息,并访问数据库查询是否存在
        boolean i =userService.findByNamePwd(username,password);
        System.out.println(i);
            ModelAndView mv = new ModelAndView();
        if (i){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            mv.setViewName("index");
            return mv;
        }
        mv.addObject("message","用户名或密码错误");
        mv.setViewName("loginForm");
        return mv;
    }
    //用户展示
    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        List userList = userService.get_List();
        mv.addObject("userList",userList);
        mv.setViewName("user/list");
        return mv;
    }
    //增加用户
    @RequestMapping("add")
    public String addUser(@RequestParam("username") String username,@RequestParam("password") String password,
                          @RequestParam("typename") String typename) {

        User user = new User(typename,username,password);
        //先进行添加，在查询展示
        userService.addUser(user);
         return "redirect:list";
    }
    //删除用户
    @RequestMapping("delete{id}")
    public String byIdDelUser(@PathVariable("id") Integer id){
        userService.byIdDelUser(id);
        return "redirect:list";
    }
    //进入修改用户页面
    @RequestMapping("updateUserView")
    public ModelAndView updateUserView(@RequestParam("id") Integer id){
        ModelAndView mv =new ModelAndView();
        System.out.println(id);
        //先拿到id返回出原本信息
        User user =userService.byIdFindUser(id);
        System.out.println(user);
        mv.addObject("user",user);
        mv.setViewName("user/update");
        return mv;
    }
    //修改用户提交
    @RequestMapping("update")
   public String update(User user, HttpServletRequest request){
        userService.updateUser(user);

    return "redirect:list";
   }
}
