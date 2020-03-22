package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 说明这是个控制器类
 */
@Controller
public class StudentController {
    /**
     * 数据源
     */
    @Resource
    private StudentService studentService;

    /**
     * service拿到数据放到model并且传到index.jsp页面
     * @param model 测试
     * @return
     */
//    @RequestMapping("index")
//    public String index(Model model){
//        List<Student> students = studentService.selectStudent();
//        model.addAttribute("list",students);
//        return "index.jsp";
//    }

    /**
     * 测试访问demo_index
     */
    @RequestMapping("demo_index")
    public String demo_index(Model model){
        List<Student> students = studentService.selectStudent();
        model.addAttribute("list",students);
        return "demo/demo_index";
    }
}
