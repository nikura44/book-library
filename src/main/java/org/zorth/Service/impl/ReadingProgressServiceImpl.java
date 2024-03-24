package org.zorth.Service.impl;

import org.springframework.stereotype.Service;
import org.zorth.Service.ReadingProgressService;
import org.zorth.mapper.ReadingProgressMapper;
import org.zorth.pojo.ReadingProgress;

@Service
public class ReadingProgressServiceImpl implements ReadingProgressService {
    private final ReadingProgressMapper readingProgressMapper;

    public ReadingProgressServiceImpl(ReadingProgressMapper readingProgressMapper) {
        this.readingProgressMapper = readingProgressMapper;
    }

    @Override
    public ReadingProgress getProgressById(int progressId) {
        return readingProgressMapper.getProgressById(progressId);
    }

    @Override
    public ReadingProgress addProgress(ReadingProgress progress) {
        readingProgressMapper.insertProgress(progress);
        return progress;
    }

    @Override
    public ReadingProgress updateProgress(ReadingProgress progress) {
        readingProgressMapper.updateProgress(progress);
        return progress;
    }

    @Override
    public void deleteProgress(int progressId) {
        readingProgressMapper.deleteProgress(progressId);
    }
}
