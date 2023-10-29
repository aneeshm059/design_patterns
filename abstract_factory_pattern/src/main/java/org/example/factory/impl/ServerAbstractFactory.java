package org.example.factory.impl;

import org.example.IComputer;
import org.example.factory.ComputerAbstractFactory;
import org.example.impl.Server;

public class ServerAbstractFactory extends ComputerAbstractFactory {
    @Override
    public IComputer getComputer(String ram, String cpu, String hardDisk) {
        return new Server(ram, cpu, hardDisk);
    }
}
