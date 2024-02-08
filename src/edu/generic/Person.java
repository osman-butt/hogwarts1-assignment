package edu.generic;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person() {}

    public Person(String fullName) {
        setFullName(fullName);
    }

    public Person(String firstName,String lastName) {
        this(firstName, null, lastName);
    }

    public Person(String firstName, String middleName,String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(Person person) {
        this.firstName = person.getFirstName();
        this.middleName = person.getMiddleName();
        this.lastName = person.getLastName();
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
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
