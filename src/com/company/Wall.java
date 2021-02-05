package com.company;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
