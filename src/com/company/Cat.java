package com.company;

public class Cat extends Competitors implements Jumpable, Runable{

    public Cat(int height, int speed) {
        super(height, speed);
    }

    public int jump() {
        return height;
    }

    public int run() {
        return speed;
    }


}
