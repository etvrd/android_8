package com.company;

public class GenerateRunable {

    public static Runable[] getRunnables(){
        Runable cat = new Cat("Борис", 3);
        Runable dog = new Dog("Барбос", 5);
        Runable robot = new Robot();
        return new Runable[]{cat, dog, robot};
    }

}
