package com.demo.service;

import com.demo.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询Student表全部数据
     * @return
     */
    public List<Student> selectStudent();
}
