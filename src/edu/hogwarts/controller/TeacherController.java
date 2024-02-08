package edu.hogwarts.controller;

import edu.hogwarts.model.HogwartsTeacher;

import java.util.ArrayList;
import java.util.UUID;

public class TeacherController implements Controller<HogwartsTeacher> {

    public TeacherController() {}
    @Override
    public void create(HogwartsTeacher object) {

    }

    @Override
    public HogwartsTeacher get(UUID id) {
        return null;
    }

    @Override
    public ArrayList<HogwartsTeacher> getAll() {
        return null;
    }

    @Override
    public void update(UUID id, HogwartsTeacher object) {

    }

    @Override
    public void delete(UUID id, HogwartsTeacher object) {

    }
}
