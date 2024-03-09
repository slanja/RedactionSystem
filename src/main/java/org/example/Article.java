package org.example;

public class Article {
    private int ID;
    private String author;
    private String title;
    private String text;
    public Article(int ID, String author, String title, String text) {
        this.ID = ID;
        this.author = author;
        this.title = title;
        this.text = text;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getID() {
        return ID;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
