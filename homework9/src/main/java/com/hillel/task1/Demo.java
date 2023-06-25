package com.hillel.task1;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Methods.string("I like Java!!!");
        String f = "I like Java!!!";
        String d = f.replace('a', 'o');
        System.out.println(d);
        String general = f.toUpperCase(Locale.ROOT);
        System.out.println(general);
        String littleLetter = f.toLowerCase(Locale.ROOT);
        System.out.println(littleLetter);


    }
}
