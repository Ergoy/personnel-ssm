package com.ssm.controller;

import com.ssm.model.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("list")
    public ModelAndView listEmployee(){
        //查询员工列表
       List<Employee> empList =  employeeService.findEmpList();
        System.out.println(empList);
       ModelAndView mv =  new ModelAndView();
       mv.addObject("empList",empList);
       mv.setViewName("employee/list");
       return mv;
    }

    //删除
    @RequestMapping("delete{id}")
    public String ByIdDelEmployee(@PathVariable("id") Integer id){
        employeeService.ByIdDelEmployee(id);

        return "redirect:list";
    }
    //增加
    @RequestMapping("add")
    public String addEmployee(){
    return "";
    }


}
