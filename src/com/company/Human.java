package com.company;

public class Human extends Competitors implements Runable, Jumpable {

    public Human(int height, int speed) {
        super(height, speed);
    }
    @Override
    public int jump() {
        return height;
    }
    @Override
    public int run() {
        return speed;
    }

}
