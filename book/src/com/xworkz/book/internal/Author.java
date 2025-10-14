package com.xworkz.book.internal;

public class Author {
    public String name;
    public int yearBorn;

    public Author(String name, int yearBorn) {
        this.name = name;
        this.yearBorn = yearBorn;
    }

    public void displayAuthorInfo() {
        System.out.println("Author Name = " + name);
        System.out.println("Author Year Born = " + yearBorn);
    }
}

