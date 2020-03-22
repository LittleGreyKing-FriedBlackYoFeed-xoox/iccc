package com.demo.service.impl;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 实现类
 */
@Service
public class StudentServiceImpl implements StudentService {
    //需要调用dao层的方法
    @Resource
    private StudentDao dao;

    public List<Student> selectStudent() {
        return dao.selectStudent();
    }
}
