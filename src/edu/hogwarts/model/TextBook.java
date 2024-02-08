package edu.hogwarts.model;

public class TextBook extends TeachingMaterial {
    private String author;
    private String publisher;
    private int publishedYear;

    public TextBook(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String author, String publisher, int publishedYear) {
        super(name, onShoppingList, required, provided, notes);
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

    public TextBook(String name, boolean onShoppingList, boolean required, boolean provided, String author, String publisher, int publishedYear) {
        super(name, onShoppingList, required, provided);
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
