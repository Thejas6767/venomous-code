package com.xworkz.book.extenal;

import com.xworkz.book.internal.Author;
import com.xworkz.book.internal.Book;
import com.xworkz.book.internal.FictionBook;

public class BookStore {
    public static void main(String[] args) {

        Author author = new Author("Jane Austen", 1775);


        Book myBook = new FictionBook("Pride and Prejudice", author);


        myBook.displayBookInfo();
    }
}
