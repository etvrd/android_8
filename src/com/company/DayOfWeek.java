package com.company;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String russianName;
    private int humanNumber;

    DayOfWeek(String russianName) {
        this.russianName = russianName;
    }

    DayOfWeek(String russianName, int number) {
        this.russianName = russianName;
        this.humanNumber = number;
    }

    public String getRussianName() {
        return russianName;
    }

    public void printSomething(){
        System.out.println("asdasjdfa");
    }
}
