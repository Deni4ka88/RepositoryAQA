package com.hillel.smartphones.device;

import com.hillel.smartphones.abstractions.Device;
import com.hillel.smartphones.interfaces.Smartphones;

public class Androids extends Device implements Smartphones {
    int battery;
    String audioOutput;

    public Androids(int ram, int cpu, String os, int battery, String audioOutput) {
        super(ram, cpu, os);
        this.battery = battery;
        this.audioOutput = audioOutput;
    }

    @Override
    public int call() {
        return 23434563;
    }

    @Override
    public String sms() {
        return "SMS";
    }

    @Override
    public String internet() {
        return "5G";
    }
}
