package org.zorth.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Setter
@Getter
public class ReadingProgress {
    private int progressId;
    private int bookId;
    private Timestamp startTime;
    private Timestamp endTime;
    private int pagesRead;
    private int durationMinutes;

    // Getter and Setter methods
}
