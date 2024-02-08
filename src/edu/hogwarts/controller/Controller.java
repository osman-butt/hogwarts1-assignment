package edu.hogwarts.controller;
import java.util.ArrayList;
import java.util.UUID;

public interface Controller<T> {
    void create(T object);
    T get(UUID id);
    ArrayList<T> getAll();
    void update(UUID id,T object);
    void delete(UUID id);
}
