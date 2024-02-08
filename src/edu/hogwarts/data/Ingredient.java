package edu.hogwarts.data;

public class Ingredient extends TeachingMaterial{
    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double amount, String unit) {
        super(name, onShoppingList, required, provided, notes);
        this.amount = amount;
        this.unit = unit;
    }

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, double amount, String unit) {
        super(name, onShoppingList, required, provided);
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
