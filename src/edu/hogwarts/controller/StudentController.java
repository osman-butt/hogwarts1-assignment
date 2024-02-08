package edu.hogwarts.controller;

import edu.hogwarts.model.HogwartsStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class StudentController implements Controller<HogwartsStudent>{

    private HashMap<UUID,HogwartsStudent> students;

    public StudentController() {
        // Initialize the list of students
        students = new HashMap<>();
    }

    @Override
    public void create(HogwartsStudent student) {
        students.put(student.getId(),student);
    }

    @Override
    public HogwartsStudent get(UUID id) {
        return students.get(id);
    }

    @Override
    public ArrayList<HogwartsStudent> getAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void update(UUID id, HogwartsStudent object) {
        HogwartsStudent updatedStudent = students.get(id);
        updatedStudent.setFullName(object.getFullName());
        updatedStudent.setHouse(object.getHouse());
        updatedStudent.setTeams(object.getTeams());
        updatedStudent.setEnrollmentYear(object.getEnrollmentYear());
        updatedStudent.setGraduationYear(object.getGraduationYear());
//        updatedStudent.setPrefect(); ADD PREFECT
    }

    @Override
    public void delete(UUID id) {
        students.remove(id);
    }
}
