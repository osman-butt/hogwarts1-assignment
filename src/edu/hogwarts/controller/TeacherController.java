package edu.hogwarts.controller;

import edu.hogwarts.model.HogwartsStudent;
import edu.hogwarts.model.HogwartsTeacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class TeacherController implements Controller<HogwartsTeacher> {

    private HashMap<UUID, HogwartsTeacher> teachers;
    public TeacherController() {
        // Initialize the list of teachers
        teachers = new HashMap<>();
    }
    @Override
    public void create(HogwartsTeacher teacher) {
        teachers.put(teacher.getId(),teacher);
    }

    @Override
    public HogwartsTeacher get(UUID id) {
        return teachers.get(id);
    }

    @Override
    public ArrayList<HogwartsTeacher> getAll() {
        return new ArrayList<>(teachers.values());
    }

    @Override
    public void update(UUID id, HogwartsTeacher object) {
        HogwartsTeacher updatedTeacher = teachers.get(id);
        updatedTeacher.setHouse(object.getHouse());
        updatedTeacher.setFullName(object.getFullName());
        updatedTeacher.setHeadOfHouse(object.isHeadOfHouse());
        updatedTeacher.setEmployment(object.getEmployment());
        updatedTeacher.setEmploymentStart(object.getEmploymentStart());
        updatedTeacher.setEmploymentEnd(object.getEmploymentEnd());
    }

    @Override
    public void delete(UUID id) {
        teachers.remove(id);
    }
}
