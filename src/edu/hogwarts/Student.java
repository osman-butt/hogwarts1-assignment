package edu.hogwarts;

import java.time.LocalDate;

public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated = false;

    public Student(String fullName, int enrollmentYear, int graduationYear) {
        super(fullName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
    }

    public Student(String firstName, String lastName, int enrollmentYear, int graduationYear) {
        super(firstName, lastName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
    }

    public Student(String firstName, String middleName, String lastName, int enrollmentYear, int graduationYear) {
        super(firstName, middleName, lastName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
    }

    public Student(Person person, int enrollmentYear, int graduationYear) {
        super(person);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    private void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }
}
