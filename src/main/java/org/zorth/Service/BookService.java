package org.zorth.Service;

import org.zorth.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(int bookId);
}
