package edu.hogwarts;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;

    public Course(Subject subject, Teacher teacher, Student[] students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String toString() {
        return "Course: " + getSubject().getName() + ", Year: "+ subject.getSchoolYear() + ", Taught by: " +  getTeacher().getFullName() + ", Enrolled students: "+students.length;
    }
}
