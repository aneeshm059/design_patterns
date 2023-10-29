package org.example.factory.impl;

import org.example.IComputer;
import org.example.factory.ComputerAbstractFactory;
import org.example.impl.PC;

public class PCAbstractFactory extends ComputerAbstractFactory {
    @Override
    public IComputer getComputer(String ram, String cpu, String hardDisk) {
        return new PC(ram, cpu, hardDisk);
    }
}
