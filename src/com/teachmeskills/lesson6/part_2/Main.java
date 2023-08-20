package com.teachmeskills.lesson6.part_2;

import com.teachmeskills.lesson6.part_2.model.Student;

/**
 * Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию)
 * Переопределить в классе методы toString,hashcode и equals.
 * Создать несколько экземпляров класса с одним и тем же значением
 * полей и сравнить с помощью метода equals.
 */

public class Main {
    public static void main(String[] args) {
            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student("Ivan", "Ivanov", "WB456", "AN_15");
            Student student4 = new Student("Dima", "Ivanov", "WB432", "BK_4");

            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);
            System.out.println(student4);
            System.out.print("\nStudent1 == Student2: ");
            System.out.println(student1.equals(student2));
            System.out.println(student1.hashCode() + " == " + student2.hashCode());
            System.out.print("\nStudent3 == Student4: ");
            System.out.println(student3.equals(student4));
            System.out.println(student3.hashCode() + " != " + student4.hashCode());
        }
    }
