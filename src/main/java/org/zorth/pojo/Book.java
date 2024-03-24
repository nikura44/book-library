package org.zorth.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book {
    // 图书ID
    private int bookId;

    // 书名
    private String title;

    // 作者
    private String author;

    // 封面链接
    private String coverUrl;

    // 总页数
    private int totalPages;

    // 总阅读时长（分钟）
    private int totalReadingDurationMinutes;

    // 最近的阅读时间
    private Date recentReadingTime;

    // toString method
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", totalPages=" + totalPages +
                ", totalReadingDurationMinutes=" + totalReadingDurationMinutes +
                ", recentReadingTime=" + recentReadingTime +
                '}';
    }
}
