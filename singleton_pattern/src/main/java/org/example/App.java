package org.example;

import main.java.org.example.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }
}
