package edu.generic;

public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated = false;
    private final RoleType roleType = RoleType.STUDENT;

    public Student(String fullName, String birthDay, int enrollmentYear, int graduationYear,boolean graduated) {
        super(fullName,birthDay);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(String firstName, String lastName, String birthDay, int enrollmentYear, int graduationYear,boolean graduated) {
        super(firstName, lastName,birthDay);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(String firstName, String middleName, String lastName, String birthDay, int enrollmentYear, int graduationYear,boolean graduated) {
        super(firstName, middleName, lastName,birthDay);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(Person person, int enrollmentYear, int graduationYear,boolean graduated) {
        super(person);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
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

    public RoleType getRole() {
        return roleType;
    }

    public String toString() {
        return super.toString() + ", Enrollment year: " +getEnrollmentYear() +  ", Graduated: " + isGraduated() + ", Graduation year: "+ getGraduationYear();
    }
}
