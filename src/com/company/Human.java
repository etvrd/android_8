package com.company;

public class Human extends Competitors implements Runable, Jumpable {

    public Human(int height, int speed) {
        super(height, speed);
    }
    @Override
    public void jump() {
        if (height <= 2)
            System.out.println("Человек преодолел это препятствие.");
        else
            System.out.println("Человеку не преодолеть эту стенку.");
    }
    @Override
    public void run() {
        if (speed <= 30)
            System.out.println("Человек бежит.");
        else
            System.out.println("Человек начинает бежать, но сразу падает.");
    }

}
