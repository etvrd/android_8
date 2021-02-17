package com.company;

public class Robot implements Jumpable, Runable{

    private int characteristic;

    public Robot (int characteristic) {
        this.characteristic = characteristic;
    }
    @Override
    public int action() {
        return characteristic;
    }

}
