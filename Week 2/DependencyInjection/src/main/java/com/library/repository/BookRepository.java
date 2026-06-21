package com.library.repository;

public class BookRepository {
    public void addBook(String bookName) {
        System.out.println("Book added: " + bookName);
    }
    public void listBooks() {
        System.out.println("Listing all books in the library.");
    }
}
