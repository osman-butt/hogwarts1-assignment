package edu.hogwarts.data;

public class Tool extends TeachingMaterial {
    private String description;

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String description) {
        super(name, onShoppingList, required, provided, notes);
        this.description = description;
    }

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String description) {
        super(name, onShoppingList, required, provided);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
