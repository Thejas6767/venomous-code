package com.xworkz.bookpublish.external;

import com.xworkz.bookpublish.internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book newBook = new Book();

        System.out.println(" Testing ISBN");
        newBook.validateISBN("97812345678"); // 11 characters

        System.out.println(" Testing Word Count");
        newBook.checkWordCount(45000);

        System.out.println(" Testing Plagiarism");
        newBook.checkPlagiarism(15.5f);

        System.out.println("Testing Format");
        newBook.checkFormat("PDF");

        System.out.println(" Testing Deadline ");
        newBook.checkDeadline(3);
    }
}