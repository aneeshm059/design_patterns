package org.example.factory;

import org.example.IComputer;

public abstract class ComputerAbstractFactory {
    public abstract IComputer getComputer(String ram, String cpu, String hardDisk);

    public IComputer create(String ram, String cpu, String hardDisk){
        return getComputer( ram,  cpu,  hardDisk);
    }
}
