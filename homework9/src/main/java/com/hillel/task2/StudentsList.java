package com.hillel.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsList {
    public static void main(String[] args) {


        Scanner scannerList = new Scanner(System.in);
        List<String> studentListAll = new ArrayList<>();

        int listLength = 1;

        for (int i = 0; i < listLength; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student lastname");
            String studentLastname = MethodForStudents.studentData(scanner);
            if (studentLastname.length() > 15) {
                studentLastname = studentLastname.substring(0, 15);
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter student grade");
            String studentGrade = MethodForStudents.studentData(scanner1);
            if (studentGrade.length() > 3) {
                studentGrade = studentGrade.substring(0, 3);
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter subject");
            String subject = MethodForStudents.studentData(scanner2);
            if (subject.length() > 10) {
                subject = subject.substring(0, 10);
            }

            MethodForStudents studentList = new MethodForStudents(studentLastname, studentGrade, subject);
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


