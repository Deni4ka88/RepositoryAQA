package com.hillel.task1;

public class Methods {
    public static void string (String str){
        System.out.println(str);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.substring(7,11));

    }
}
