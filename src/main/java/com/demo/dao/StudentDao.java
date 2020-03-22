package com.demo.dao;


import com.demo.entity.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 查询Student表全部数据
     * @return
     */
    public List<Student> selectStudent();
}
