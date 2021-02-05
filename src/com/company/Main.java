package com.company;

public class Main {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
        DayOfWeek day2 = DayOfWeek.MONDAY;
        DayOfWeek day3 = DayOfWeek.SUNDAY;
        DayOfWeek day4 = DayOfWeek.FRIDAY;

        DayOfWeek[] week = DayOfWeek.values();
        System.out.println(DayOfWeek.SATURDAY.ordinal());
    }
}
