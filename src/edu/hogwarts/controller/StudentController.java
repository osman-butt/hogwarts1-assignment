package edu.hogwarts.controller;

import edu.hogwarts.model.HogwartsStudent;

import java.util.ArrayList;
import java.util.UUID;

public class StudentController implements Controller<HogwartsStudent>{

    public StudentController() {}

    @Override
    public void create(HogwartsStudent object) {

    }

    @Override
    public HogwartsStudent get(UUID id) {
        return null;
    }

    @Override
    public ArrayList<HogwartsStudent> getAll() {
        return null;
    }

    @Override
    public void update(UUID id, HogwartsStudent object) {

    }

    @Override
    public void delete(UUID id, HogwartsStudent object) {

    }
}
