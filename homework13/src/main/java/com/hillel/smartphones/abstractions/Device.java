package com.hillel.smartphones.abstractions;

public abstract class Device {
    private int ram;
    private int cpu;
    private String os;

    public Device(int ram, int cpu, String os) {
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

    public String getOs() {
        return os;
    }
}
