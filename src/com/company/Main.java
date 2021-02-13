package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество команд: ");
        // в качестве участника я принял команду из человека, кота и робота - из-за этого
        // пострадали интерфейсы - каждый участник по отдельности уже не использует этот шаблон,
        // так как они наследники класса команды, который и так дает им эти способности
        int n = sc.nextInt();
        Competitors[][] competitors = new Competitors[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Характеристики команды №" + (i+1));
            competitors[i] = generateCompetitors();
        }

        System.out.println("Введите количество препятствий: ");
        n = sc.nextInt();
        Wall[] wall = new Wall[n];
        RunRoad[] runRoad = new RunRoad[n];
        for (int i = 0; i < n ; i++) {
            int barHeight, barSpeed;
            System.out.println("Характеристики препятствия №" + (i+1));
            System.out.println("Введите высоту стены: ");
            barHeight = sc.nextInt();
            wall[i] = new Wall(barHeight);
            System.out.println("Введите скорость беговой дорожки: ");
            barSpeed = sc.nextInt();
            runRoad[i] = new RunRoad(barSpeed);
        }

        System.out.println("Соревнования начались!\n");
        int winners = 0;
        for (int i = 0; i < competitors.length; i++) {
            int k, j = 0;
            do {
                k = 0;
                do {
                    String type = "";
                    switch (k){
                        case 0:
                            type = "Человек";
                            break;
                        case 1:
                            type = "Кот";
                            break;
                        case 2:
                            type = "Робот";
                            break;
                    }
                    if (competitors[i][k].jump() >= wall[j].getHeight() &&
                        competitors[i][k].run() >= runRoad[j].getSpeed()){
                        System.out.println(type + " команды №" + (i+1) + " прошёл " + (j+1) + " препятствие!");
                    }
                    else {
                        System.out.println(type + " команды №" + (i+1) + " не прошёл " + (j+1) + " препятствие," +
                                " дальше эта команда не проходит :(\n");
                        k = 3;
                    }
                    k++;
                } while (k < 3);
                j++;
            } while (j < n && k < 4);
            if (k != 4) {
                winners++;
                System.out.println("Мы поздравляем команду №" + (i + 1) + ", она преодолела все препятствия!");
                System.out.println();
            }
        }
        if (winners > 0)
            System.out.println("Количество команд, прошедших все препятствия: " + winners);
        else
            System.out.println("Ни одна команда не прошла все препятствия.");
    }
    public static Competitors[] generateCompetitors(){
        int height, speed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту прыжка человека: ");
        height = sc.nextInt();
        System.out.println("Введите скорость человека: ");
        speed = sc.nextInt();
        Competitors human = new Human(height, speed);
        System.out.println("Введите высоту прыжка кота: ");
        height = sc.nextInt();
        System.out.println("Введите скорость кота: ");
        speed = sc.nextInt();
        Competitors cat = new Cat(height, speed);
        System.out.println("Введите высоту прыжка робота: ");
        height = sc.nextInt();
        System.out.println("Введите скорость робота: ");
        speed = sc.nextInt();
        Competitors robot = new Robot(height, speed);
        return new Competitors[]{human, cat, robot};
    }
}

