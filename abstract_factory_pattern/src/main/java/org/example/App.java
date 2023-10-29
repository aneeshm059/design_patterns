package org.example;

import org.example.factory.ComputerAbstractFactory;
import org.example.factory.impl.LapTopAbstractFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ComputerAbstractFactory computerAbstractFactory = new LapTopAbstractFactory();
        IComputer computer = computerAbstractFactory.create("12GB", "2.4HGZ", "500GB");
        System.out.println(computer.getCpu());

    }
}
