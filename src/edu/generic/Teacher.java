package edu.generic;

import edu.hogwarts.model.EmpType;

import java.time.LocalDate;

public class Teacher extends Person {
    private EmpType employment;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher(String fullName, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(fullName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String firstName, String lastName, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, lastName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String firstName, String middleName, String lastName, EmpType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, middleName, lastName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public EmpType getEmployment() {
        return employment;
    }

    public void setEmployment(EmpType employment) {
        this.employment = employment;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    public String toString() {
        return super.toString() + ", Employment type: " + employment + ", Employment start: " + getEmploymentStart() + ", Employment end: "+ getEmploymentEnd();
    }
}
