package org.example.impl;

import org.example.IComputer;

public class Server implements IComputer {
    private String ram;
    private String cpu;
    private String hardDisk;

    public Server(String ram, String cpu, String hardDisk) {
        this.ram = ram;
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHardDisk() {
        return this.hardDisk;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
