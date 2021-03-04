package com.wool.edu.info.manager.service;

import com.wool.edu.info.manager.dao.StudentDao;
import com.wool.edu.info.manager.domain.Student;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public boolean isExist(String id) {
        Student[] students = studentDao.queryStudent();
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if(stu != null){
                if(stu.getId().equals(id)){
                    exist = true;
                }
            }
            else{
                break;
            }
        }
        return exist;
    }

    public boolean addStudent(Student stu) {
        studentDao = new StudentDao();
        return studentDao.addStudent(stu);
    }

    public Student[] queryStudent() {
        Student[] stus = studentDao.queryStudent();
        boolean empty = true;
        for (int i = 0; i < stus.length; i++) {
            if(stus[i] != null){
                empty = false;
                break;
            }
        }
        if(!empty){
            return stus;
        }
        else {
            return null;
        }
    }

    public void deleteStudentById() {
    }
}
