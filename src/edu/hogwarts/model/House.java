package edu.hogwarts.model;

import org.jetbrains.annotations.NotNull;

public class House implements Comparable<House> {
    private String name;
    private String founder;
    private String[] colors;

    public House(String name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(@NotNull House o) {
        return this.getName().compareTo(o.getName());
    }
}
