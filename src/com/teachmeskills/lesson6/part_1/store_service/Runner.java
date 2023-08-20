package com.teachmeskills.lesson6.part_1.store_service;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipСontainer;
import com.teachmeskills.lesson6.part_1.store_service.model.store.Warehouse;

import java.util.Arrays;

/**
 * Доработать пример с занятия.
 */

public class Runner {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();

        ShipСontainer container1 = new ShipСontainer(43, 24, 13);
        ShipСontainer container2 = new ShipСontainer(32, 42, 51, 4000, "Посылка с Алика");
        ShipСontainer container3 = new ShipСontainer();

        ShipСontainer[] containers = new ShipСontainer[4];
        containers[0] = container1;
        containers[1] = container2;
        containers[2] = container3;

        warehouse1.setContainers(containers);

        // Тут добавляем в существующий массив контейнеров другой массив
        ShipСontainer[] anotherContainers = new ShipСontainer[2];
        ShipСontainer container4 = new ShipСontainer(3, 420, 11, 24400, "Новый контейнер");
        anotherContainers[0] = container4;
        warehouse1.addContainers(anotherContainers);

        System.out.println("\nOur containers : ");
        warehouse1.showContainers();

        System.out.println("\nContainers price : \n" + Arrays.toString(warehouse1.getContainersPrices()));

        System.out.println(warehouse1.address = "ertuy");


    }
}