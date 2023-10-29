package main.java.org.example;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null)
            synchronized (Singleton.class){
                if(singleton == null)
                    singleton = new Singleton();
            }
        return singleton;
    }

    public void print(){
        System.out.println("I am from Singleton class");
    }
}
