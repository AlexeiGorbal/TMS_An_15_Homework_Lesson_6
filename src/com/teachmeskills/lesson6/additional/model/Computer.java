package com.teachmeskills.lesson6.additional.model;

public class Computer {
    private double prise;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(double prise, String model) {
        this.prise = prise;
        this.model = model;
    }

    public Computer(double prise, String model, HDD hdd, RAM ram) {
        this.prise = prise;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "prise=" + prise +
                ", model='" + model + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }


}

