package com.teachmeskills.lesson6.part_2.model;

import java.util.Objects;

public class Student {

    String name;
    String surName;
    String passportID;
    String nameGroup;

    public Student() {
        this.name = "Alex";
        this.surName = "Gorbal";
        this.passportID = "WD123";
        this.nameGroup = "AN_15";
    }

    public Student(String name, String surName, String passportID, String nameGroup) {
        this.name = name;
        this.surName = surName;
        this.passportID = passportID;
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", passportID='" + passportID + '\'' +
                ", nameGroup='" + nameGroup + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(surName, student.surName) && Objects.equals(passportID, student.passportID) && Objects.equals(nameGroup, student.nameGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, passportID, nameGroup);
    }
}
