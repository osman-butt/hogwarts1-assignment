package edu.hogwarts.model;

import edu.generic.Teacher;

import java.time.LocalDate;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName,String birthDay, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(fullName, birthDay, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String lastName,String birthDay, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, birthDay, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String middleName, String lastName,String birthDay, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, birthDay, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    public String toString() {
        return super.toString() + ", House: " + getHouse().toString() + ", Head of house: " + isHeadOfHouse();
    }
}
