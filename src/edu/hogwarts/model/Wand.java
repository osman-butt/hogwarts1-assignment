package edu.hogwarts.model;

public class Wand extends TeachingMaterial{
    private double lengthInInches;
    private String wood;
    private String core;

    public Wand(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double lengthInInches, String wood, String core) {
        super(name, onShoppingList, required, provided, notes);
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    public Wand(String name, boolean onShoppingList, boolean required, boolean provided, double lengthInInches, String wood, String core) {
        super(name, onShoppingList, required, provided);
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
}
