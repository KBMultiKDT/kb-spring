package com.multi.spring2_2.java_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Building {
    private final Window window;

    @Autowired
    public Building(Window window) {
        this.window = window;
    }

    public void open() {
        window.open();
        System.out.println("building open");
    }
}