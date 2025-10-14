package com.xworkz.book.internal;

public abstract class Book {
    public int pageCount;
    public String title;
    public Author primaryAuthor;

    public Book(int pageCount, String title, Author primaryAuthor) {
        this.pageCount = pageCount;
        this.title = title;
        this.primaryAuthor = primaryAuthor;
    }

    public void displayBookInfo() {
        System.out.println("Book Title = " + title);
        System.out.println("Number of Pages = " + pageCount);
        System.out.println("Primary Author = " + primaryAuthor.name);
        System.out.println("Author's Birth Year = " + primaryAuthor.yearBorn);
        System.out.println("Book Type = " + this.getClass().getSimpleName());
    }
}
