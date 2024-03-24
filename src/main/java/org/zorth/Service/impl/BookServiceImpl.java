package org.zorth.Service.impl;

import org.springframework.stereotype.Service;
import org.zorth.Service.BookService;
import org.zorth.mapper.BookMapper;
import org.zorth.pojo.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book getBookById(int bookId) {
        return bookMapper.getBookById(bookId);
    }

    @Override
    public Book addBook(Book book) {
        bookMapper.insertBook(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        bookMapper.updateBook(book);
        return book;
    }

    @Override
    public void deleteBook(int bookId) {
        bookMapper.deleteBook(bookId);
    }
}
