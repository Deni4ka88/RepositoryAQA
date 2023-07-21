package com.hillel.smartphones.main;

import com.hillel.smartphones.device.Androids;
import com.hillel.smartphones.device.Iphones;
import com.hillel.smartphones.enums.OS;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids(12, 10, OS.ANDROID, 5500, "jack 3,5 mm");
        System.out.println(androids.sms());

        Iphones iphones = new Iphones(6, 6, OS.IOS, 12, true);
        System.out.println(iphones.call());
        System.out.println(iphones.internet());
    }
}
