package com.hillel.smartphones.abstractions;

import com.hillel.smartphones.enums.OS;

public abstract class Device {
    private int ram;
    private int cpu;
    private OS os;

    public Device(int ram, int cpu, OS os) {
        this.ram = ram;
        this.cpu = cpu;
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public int getCpu() {
        return cpu;
    }

    public OS getOs() {
        return os;
    }
}
