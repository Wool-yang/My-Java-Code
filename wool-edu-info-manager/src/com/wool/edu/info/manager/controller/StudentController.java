package com.wool.edu.info.manager.controller;

import com.wool.edu.info.manager.dao.StudentDao;
import com.wool.edu.info.manager.domain.Student;
import com.wool.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public void start() {
        lo1:while(true) {
            System.out.println("--------Welcome to <Student> Manager System--------");
            System.out.println("Input to Select: 1.Insert  2.Delete  3.Update  4.Query  5.Exit");
            String in = sc.next();
            switch (in) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudentById();
                    break;
                case "3":

                    break;
                case "4":
                    queryStudent();
                    break;
                case "5":
                    System.out.println("Back to Main Menu");

                    break lo1;
            }
        }
    }

    private void deleteStudentById() {
        studentService.deleteStudentById();
    }

    private void queryStudent() {
        Student[] stus = studentService.queryStudent();
        if(stus == null){
            System.out.println("There is no information");
            return;
        }
        System.out.println("Id\t\tName\tAge\tBirthday");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirth());
            }
            else{
                break;
            }
        }
    }


    private void addStudent() {
        String id;
        while(true){
            System.out.println("Please input the student id");
            id = sc.next();
            boolean exist = false;
            exist = studentService.isExist(id);
            if(exist){
                System.out.println("This id have been existed, please input another one");
            }
            else{
                break;
            }
        }
        System.out.println("Please input the student name");
        String name = sc.next();
        System.out.println("Please input the student age");
        String age = sc.next();
        System.out.println("Please input the student birthday");
        String birth = sc.next();
        Student stu = new Student(id, name, age, birth);
        boolean result = studentService.addStudent(stu);
        if(result){
            System.out.println("Insert Success");
        }
        else {
            System.out.println("Insert failed");
        }
    }
}
