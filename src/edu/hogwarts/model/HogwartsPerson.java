package edu.hogwarts.model;

public interface HogwartsPerson {

    // Every class that implements this interface
    // (HogwartsStudent and HogwartsTeacher)
    // must have these methods:
    House getHouse();
    void setHouse(House house);
}
