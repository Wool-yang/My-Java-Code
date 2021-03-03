package com.wool.edu.info.manager.controller;

import com.wool.edu.info.manager.dao.StudentDao;
import com.wool.edu.info.manager.domain.Student;
import com.wool.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        lo1:while(true) {
            System.out.println("--------Welcome to <Student> Manager System--------");
            System.out.println("Input to Select: 1.Insert  2.Delete  3.Update  4.Query  5.Exit");
            String in = sc.next();
            switch (in) {
                case "1":
                    addStudent();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":
                    System.out.println("Back to Main Menu");

                    break lo1;
            }
        }
    }

    private void addStudent() {
    }

    private void addstudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the student id");
        String id = sc.next();
        System.out.println("Please input the student name");
        String name = sc.next();
        System.out.println("Please input the student age");
        String age = sc.next();
        System.out.println("Please input the student birthday");
        String birth = sc.next();
        Student stu = new Student(id, name, age, birth);
        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(stu);
        if(result){
            System.out.println("Insert Success");
        }
        else {
            System.out.println("Insert failed");
        }
    }
}
