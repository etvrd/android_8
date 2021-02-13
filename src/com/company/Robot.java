package com.company;

public class Robot extends Competitors implements Jumpable, Runable{

    public Robot(int height, int speed) {
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
