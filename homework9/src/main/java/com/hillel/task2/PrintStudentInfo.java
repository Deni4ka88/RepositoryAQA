package com.hillel.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStudentInfo {
    public static void main(String[] args) {


        Scanner scannerList = new Scanner(System.in);
        List<String> studentListAll = new ArrayList<>();

        int listLength = 1;

        for (int i = 0; i < listLength; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student lastname");
            String studentLastname = Students.studentData(scanner);
            if (studentLastname.length() > 15) {
                studentLastname = studentLastname.substring(0, 15);
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter student grade");
            String studentGrade = Students.studentData(scanner1);
            if (studentGrade.length() > 3) {
                studentGrade = studentGrade.substring(0, 3);
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter subject");
            String subject = Students.studentData(scanner2);
            if (subject.length() > 10) {
                subject = subject.substring(0, 10);
            }

            Students studentList = new Students(studentLastname, studentGrade, subject);
            studentList.printList();

            studentListAll.add(studentList.printList());
        }
        scannerList.close();

        System.out.println("Student List");
        for (String item : studentListAll) {
            System.out.println(item);
        }
    }
}


