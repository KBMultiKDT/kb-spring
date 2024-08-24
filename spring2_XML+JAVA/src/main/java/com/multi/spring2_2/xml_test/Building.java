package com.multi.spring2_2.xml_test;

public class Building {
    private Window window;

    public void setWindow(Window window) {
        this.window = window;
    }

    public void open() {
        window.open();
        System.out.println("building open");
    }
}