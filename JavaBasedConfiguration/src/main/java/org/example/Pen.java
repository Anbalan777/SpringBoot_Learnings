package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class Pen  implements Writer{
    public Pen() {
        System.out.println("Pen Constructor");
    }

    public void write()
    {
        System.out.println("Writing using Pen");
    }
}
