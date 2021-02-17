package com.company;

public class Cat implements Jumpable, Runable{

    private int characteristic;

    public Cat (int characteristic) {
        this.characteristic = characteristic;
    }
    @Override
    public int action() {
        return characteristic;
    }


}
