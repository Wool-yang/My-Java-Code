package com.wool.edu.info.manager.dao;

import com.wool.edu.info.manager.domain.Student;

public class StudentDao {
    public boolean addStudent(Student stu) {
        Student[] students = new Student[5];
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null){
                index = i;
                break;
            }
        }
        if (index != -1){
            students[index] = stu;
            return true;
        }
        else {
            return false;
        }
    }
}
