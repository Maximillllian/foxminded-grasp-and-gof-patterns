package com.company;

public class Book {
    private String authorName;
    private String title;
    private int publishYear;

    public Book(String authorName, String title, int publishYear) {
        this.authorName = authorName;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
