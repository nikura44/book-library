package org.zorth.Service;

import org.zorth.pojo.ReadingProgress;

import java.util.List;

public interface ReadingProgressService {
    ReadingProgress getProgressById(int progressId);
    ReadingProgress addProgress(ReadingProgress progress);
    ReadingProgress updateProgress(ReadingProgress progress);
    void deleteProgress(int progressId);
}
