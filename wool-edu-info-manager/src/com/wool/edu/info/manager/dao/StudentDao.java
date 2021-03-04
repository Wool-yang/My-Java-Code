package com.wool.edu.info.manager.dao;

import com.wool.edu.info.manager.domain.Student;

public class StudentDao {
    private static Student[] students = new Student[5];
    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student == null){
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

    public Student[] queryStudent() {
        return students;
    }
}
