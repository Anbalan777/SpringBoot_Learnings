package org.example;

public class Pen implements Writer{

    Pen()
    {
        System.out.println("Pen object is created..");
    }
    public void write()
    {
        System.out.println("Writing using pen");
    }
}
