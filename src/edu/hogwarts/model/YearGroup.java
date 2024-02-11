package edu.hogwarts.model;

import edu.generic.Student;

import java.time.LocalDate;
import java.util.List;

public class YearGroup {
    private int schoolYear;
    private LocalDate beginningOfSchoolYear;
    private List<Student> students;

    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public YearGroup(int schoolYear, String beginningOfSchoolYear) {
        this.schoolYear = schoolYear;
        setBeginningOfSchoolYear(beginningOfSchoolYear);
    }

    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear, List<Student> students) {
        this(schoolYear, beginningOfSchoolYear);
        this.students = students;
    }

    public YearGroup(int schoolYear, String beginningOfSchoolYear, List<Student> students) {
        this(schoolYear, beginningOfSchoolYear);
        this.students = students;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public LocalDate getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(String beginningOfSchoolYear) {
        this.beginningOfSchoolYear = LocalDate.parse(beginningOfSchoolYear);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }
}
