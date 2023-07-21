package com.hillel.smartphones.device;

import com.hillel.smartphones.abstractions.Device;
import com.hillel.smartphones.enums.OS;
import com.hillel.smartphones.interfaces.Smartphones;

public class Iphones extends Device implements Smartphones {
    int camera;
    boolean faceID;

    public Iphones(int ram, int cpu, OS os, int camera, boolean faceID) {
        super(ram, cpu, os);
        this.camera = camera;
        this.faceID = faceID;
    }

    @Override
    public int call() {
        return 230453234;
    }

    @Override
    public String sms() {
        return "SMS";
    }

    @Override
    public String internet() {
        return "4G";
    }
}
