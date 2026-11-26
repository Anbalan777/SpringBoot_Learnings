package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Priority to inject which class object in to the interface ref variable;
public class Sketch implements Writer {
    public Sketch() {
        System.out.println("Sketch Constructor");

    }

    public void write()
    {

        System.out.println("Writing using Sketch");
    }
}
