package org.example.factory.impl;

import org.example.IComputer;
import org.example.factory.ComputerAbstractFactory;
import org.example.impl.LapTop;

public class LapTopAbstractFactory extends ComputerAbstractFactory {
    @Override
    public IComputer getComputer(String ram, String cpu, String hardDisk) {
        return new LapTop(ram, cpu, hardDisk);
    }
}
