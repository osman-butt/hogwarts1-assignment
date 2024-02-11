package edu.generic;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDay;

    private UUID id;

    public Person() {}

    public Person(String fullName, String birthDay) {
        setFullName(fullName);
        setBirthDay(birthDay);
        this.id = UUID.randomUUID();
    }

    public Person(String firstName, String lastName, String birthDay) {
        this(firstName, null, lastName, birthDay);
        this.id = UUID.randomUUID();
    }

    public Person(String firstName, String middleName,String lastName, String birthDay) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        setBirthDay(birthDay);
        this.id = UUID.randomUUID();
    }

    public Person(Person person) {
        this.firstName = person.getFirstName();
        this.middleName = person.getMiddleName();
        this.lastName = person.getLastName();
        this.birthDay = person.getBirthDay();
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        if(hasMiddleName()) {
            return middleName;
        } else {
            return "";
        }
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private LocalDate getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        LocalDate today = LocalDate.parse("1992-01-01");
        return birthDay.until(today).getYears();
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = LocalDate.parse(birthDay);
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getFullName() {
        if(hasMiddleName()) {
            return firstName + " " + middleName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }

    }

    public void setFullName(String fullName) {
        firstName = fullName.substring(0,fullName.indexOf(" "));
        lastName = fullName.substring(1+fullName.lastIndexOf(" "));
        if(fullName.indexOf(" ") == fullName.lastIndexOf(" ")) {
            middleName = null;
        } else {
            middleName = fullName.substring(1+fullName.indexOf(" "),fullName.lastIndexOf(" "));
        }
    }

    public boolean hasMiddleName() {
        return middleName != null;
    }

    public String toString() {
        return "Fullname: "+ getFullName();
    }
}
