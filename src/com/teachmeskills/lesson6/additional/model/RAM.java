package com.teachmeskills.lesson6.additional.model;

public class RAM {
    private String name;
    private double volume;

    public RAM() {
    }

    public RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume + " GB" +
                '}';
    }
}

