package com.wool.test;

import com.wool.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        lo:while (true) {
            System.out.println("----Welcome to Student Manager System----");
            System.out.println("1 Insert");
            System.out.println("2 Delete");
            System.out.println("3 Update");
            System.out.println("4 Query");
            System.out.println("5 Exit");
            System.out.println("Please input number to select:");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    addStudent(list);
                    System.out.println("123");
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("Bye");
                    break lo;
                default:
                    System.out.println("Error!");
            }
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the sid for updating");
        String sid = sc.next();
        int index = findIndex(list, sid);
        if(index == -1){
            System.out.println("No this sid!");
        }
        else{
            System.out.println("Please input sid:");
            String sid1 = sc.next();
            System.out.println("Please input name:");
            String name = sc.next();
            System.out.println("Please input age:");
            int age = sc.nextInt();
            System.out.println("Please input birth:");
            String birth = sc.next();
            Student stu = new Student(sid1,name,age,birth);
            list.set(index, stu);
            System.out.println("Update success!");
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the sid for deleting");
        String sid = sc.next();
        int index = findIndex(list, sid);
        if(index == -1){
            System.out.println("No this sid!");
        }
        else{
            list.remove(index);
            System.out.println("Delete success!");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        if(list.size() == 0){
            System.out.println("No record!");
        }
        else{
            System.out.println("sid\tname\tage\tbirthday");
            for (int i = 0; i < list.size(); i++) {
                Student temp = list.get(i);
                System.out.println(temp.getSid() + "\t" + temp.getName() + "\t" + temp.getAge() + "\t" + temp.getBirth());
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("Please input sid:");
            sid = sc.next();
            int index = findIndex(list, sid);
            if(index == -1) {
                break;
            }
            else{
                System.out.println("Sid have been existed!");
            }
        }
        System.out.println("Please input name:");
        String name = sc.next();
        System.out.println("Please input age:");
        int age = sc.nextInt();
        System.out.println("Please input birth:");
        String birth = sc.next();


        Student stu = new Student(sid, name, age, birth);
        list.add(stu);
        System.out.println("Insert success!");
    }

    public static int findIndex(ArrayList<Student> list, String sid){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(sid.equals(stu.getSid())){
                return i;
            }
        }
        return -1;
    }

}
