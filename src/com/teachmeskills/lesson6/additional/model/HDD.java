package com.teachmeskills.lesson6.additional.model;

public class HDD {
    private String name;
    private double capacity;
    private String type;

    public HDD() {
    }

    public HDD(String name, double capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity + " TB" +
                ", type=" + type +
                '}';
    }
}

