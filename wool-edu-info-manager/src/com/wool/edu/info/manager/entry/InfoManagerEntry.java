package com.wool.edu.info.manager.entry;

import com.wool.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("--------Welcome to Edu Info Manager--------");
            System.out.println("Input to Select: 1.Student Manager  2.Teacher Manager  3.Exit");
            String in = sc.next();
            switch (in) {
                case "1":
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":

                    break;
                case "3":
                    System.out.println("Bye");
                    System.exit(0);
                    break;
            }
        }
    }
}
