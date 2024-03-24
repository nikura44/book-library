package org.zorth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zorth.pojo.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> getAllBooks();
    Book getBookById(@Param("bookId") int bookId);
    int insertBook(Book book);
    int updateBook(Book book);
    int deleteBook(@Param("bookId") int bookId);
}
