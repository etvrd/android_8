package com.company;

public class Human implements Runable, Jumpable {

    private int characteristic;

    public Human (int characteristic) {
        this.characteristic = characteristic;
    }
    @Override
    public int action() {
        return characteristic;
    }

}
