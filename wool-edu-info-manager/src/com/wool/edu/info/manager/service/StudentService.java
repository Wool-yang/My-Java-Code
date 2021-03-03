package com.wool.edu.info.manager.service;

import com.wool.edu.info.manager.dao.StudentDao;
import com.wool.edu.info.manager.domain.Student;

public class StudentService {
    public boolean addStudent(Student stu) {
        StudentDao studentDao = new StudentDao();
        return studentDao.addStudent(stu);
    }
}
