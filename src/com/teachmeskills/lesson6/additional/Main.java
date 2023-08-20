package com.teachmeskills.lesson6.additional;

import com.teachmeskills.lesson6.additional.model.Computer;
import com.teachmeskills.lesson6.additional.model.HDD;
import com.teachmeskills.lesson6.additional.model.HDD_Type;
import com.teachmeskills.lesson6.additional.model.RAM;

/**
 * Создать класс для описания компьютера, в этом классе должны быть
 * поля: стоимость, модель(строковый тип), RAM и HDD.
 * Для полей RAM и HDD следует создать свои собственные классы.
 * Классы для RAM и HDD должны иметь конструктор по умолчанию и
 * конструктор со всеми параметрами.
 * Класс RAM имеет поля "название" и "объем".
 * Класс HDD имеет поля "название", "объем" и "тип" (внешний или
 * внутренний).
 * Класс Computer должен иметь два конструктора:
 * - первый - с параметрами стоимость и модель,
 * - второй - со всеми полями.
 * При создании объекта "компьютер" с помощью первого конструктора
 * должны создаваться поля RAM и HDD с помощью конструкторов по
 * умолчанию.
 * В каждом из классов предусмотреть методы для вывода полной
 * информации (вывод всех полей и всех значений).
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и
 * вывести информацию на экран;
 * создать объект "компьютер 2" с помощью второго конструктора и
 * вывести информацию на экран.
 */

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(3499, "Asus");
        System.out.println(computer1);

        RAM ram = new RAM("Viper", 4);
        HDD hdd = new HDD("Samsung", 30.72, new HDD_Type().getExternal());

        Computer computer2 = new Computer(1649, "Lenovo", hdd, ram);
        System.out.println(computer2);
    }
}
