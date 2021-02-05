package com.company;

public class Dog extends Animal implements Swimmable, Runable{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }

    @Override
    public void run() {
        System.out.println("Бегу и виляю хвостиком");
    }
}
