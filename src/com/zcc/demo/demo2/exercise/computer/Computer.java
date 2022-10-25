package com.zcc.demo.demo2.exercise.computer;

public class Computer {
    private String cpu;
    public int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails() {
        return cpu + " " + memory + " " + disk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }
}
