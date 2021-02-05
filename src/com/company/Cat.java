package com.company;

public class Cat extends Animal implements Swimmable, Runable{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Я кошка, но я все же плаваю");
    }

    @Override
    public void run() {
        System.out.println("ТЫГЫДЫК");
    }

}
