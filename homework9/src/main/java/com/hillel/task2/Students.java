package com.hillel.task2;

import java.util.Scanner;

public class Students {

    public static String studentData(Scanner scanner) {
        return scanner.nextLine();
    }

    String lastname;
    String grade;
    String subject;

    public Students(String lastname, String grade, String subject) {
        this.lastname = lastname;
        this.grade = grade;
        this.subject = subject;
    }

    public String printList() {
        return String.format("Student %-15s got %-3s by %-10s", lastname, grade, subject);
    }
}