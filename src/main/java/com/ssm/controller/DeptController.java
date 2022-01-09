package com.ssm.controller;

import com.ssm.model.Dept;
import com.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    //展示部门信息
    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv =new ModelAndView();
        //查找部门list集合
        List  deptList = deptService.deptList();
        mv.addObject("deptList",deptList);
        mv.setViewName("dept/list");
        return mv;
    }
    //通过id删除部门信息
    @RequestMapping("delete{id}")
    public String byIdDelDept(@PathVariable("id") Integer id){
        deptService.byIdDelDept(id);
        return "redirect:list";
    }
    //增加部门
    @RequestMapping("add")
    public String addDept(@RequestParam("name") String name,@RequestParam("remark") String remark){
        Dept dept = new Dept(name,remark);
        deptService.addDept(dept);
        return "redirect:list";
    }

    //返回修改的部门信息
    @RequestMapping("updateDeptView")
    public ModelAndView updateDeptView(@RequestParam("id") Integer id){
        ModelAndView mv =new ModelAndView();
        //通过id返回待修改部门的信息
        Dept dept = deptService.byIdFindDept(id);
        mv.addObject("dept",dept);
        mv.setViewName("dept/add");
        return mv;
    }

    //修改部门
    @RequestMapping("update")
    public String updateDept(Dept dept , HttpServletRequest request){
        System.out.println(dept.getName());
        deptService.updateDept(dept);
        return "redirect:list";
    }

}
