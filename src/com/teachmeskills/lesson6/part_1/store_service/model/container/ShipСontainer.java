package com.teachmeskills.lesson6.part_1.store_service.model.container;

public class ShipСontainer {

    // Fields
    int width;
    int length;
    int depth;
    String containerModel;

    // TODO
    // доваить еще одно для описание стоимости контейнера
    public double price;

    // Constructors
    public ShipСontainer() {
        System.out.println("без параметрами");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Кастомный контейнер";
        this.price = (this.depth * this.length * this.width) / 120f;
    }

    public ShipСontainer(int width, int length, int depth) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Кастомный контейнер";
        this.price = (this.depth * this.length * this.width) / 120f;
    }

    public ShipСontainer(int width, int length, int depth, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
        this.price = (this.depth * this.length * this.width) / 120f;
    }

    public ShipСontainer(int width, int length, int depth, double price, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.price = price;
        this.containerModel = boxModel;
    }

    @Override
    public String toString() {
        return "ShipСontainer{" +
                "width=" + width +
                ", length=" + length +
                ", depth=" + depth +
                ", containerModel='" + containerModel + '\'' +
                ", price=" + price +
                '}';
    }
}
