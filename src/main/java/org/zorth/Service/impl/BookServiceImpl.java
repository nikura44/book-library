package org.zorth.Service.impl;

import org.springframework.stereotype.Service;
import org.zorth.Service.BookService;
import org.zorth.mapper.BookMapper;
import org.zorth.mapper.ReadingProgressMapper;
import org.zorth.pojo.Book;
import org.zorth.pojo.ReadingProgress;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;
    private final ReadingProgressMapper readingProgressMapper;

    public BookServiceImpl(BookMapper bookMapper, ReadingProgressMapper readingProgressMapper) {
        this.bookMapper = bookMapper;
        this.readingProgressMapper = readingProgressMapper;
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
        ReadingProgress progress = new ReadingProgress();
        progress.setBookId(book.getBookId());
        LocalDateTime endTime = LocalDateTime.now(); // 获取当前时间
        Timestamp timestamp = Timestamp.valueOf(endTime); // 转换为 Timestamp 类型
        progress.setEndTime(timestamp);

        // 根据 EndTime 计算 StartTime
        LocalDateTime startTime = endTime.minusMinutes(book.getTotalReadingDurationMinutes());
        Timestamp startTimestamp = Timestamp.valueOf(startTime);
        progress.setStartTime(startTimestamp);

        progress.setDurationMinutes(book.getTotalReadingDurationMinutes());
        readingProgressMapper.insertProgress(progress);
        return book;
    }

    @Override
    public void deleteBook(int bookId) {
        bookMapper.deleteBook(bookId);
    }
}
