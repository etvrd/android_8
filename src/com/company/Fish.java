package com.company;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }
}
