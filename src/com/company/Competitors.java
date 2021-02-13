package com.company;

public class Competitors implements Jumpable, Runable {
    protected int height;
    protected int speed;

    public Competitors(int height, int speed) {
        this.height = height;
        this.speed = speed;
    }

    public int jump() {
        return height;
    }

    public int run() {
        return speed;
    }
}
