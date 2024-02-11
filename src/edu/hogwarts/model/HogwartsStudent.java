package edu.hogwarts.model;

import edu.generic.Person;
import edu.generic.Student;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(String fullName,String birthDay, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(fullName,birthDay, enrollmentYear, graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String firstName, String lastName, String birthDay, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(firstName, lastName, birthDay, enrollmentYear, graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String firstName, String middleName, String lastName, String birthDay, int enrollmentYear, boolean graduated, int graduationYear, House house, boolean prefect, String[] teams) {
        super(firstName, middleName, lastName,birthDay, enrollmentYear, graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(Person person, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(person, enrollmentYear, graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public House getHouse(){
        return house;
    };

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public String toString() {
        return super.toString() + ", House: "+getHouse().toString() + ", Prefect: "+isPrefect();
    }
}
