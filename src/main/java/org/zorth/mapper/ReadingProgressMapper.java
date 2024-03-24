package org.zorth.mapper;

import org.apache.ibatis.annotations.*;
import org.zorth.pojo.ReadingProgress;

@Mapper
public interface ReadingProgressMapper {
    ReadingProgress getProgressById(int progressId);
    int insertProgress(ReadingProgress progress);
    int updateProgress(ReadingProgress progress);
    int deleteProgress(int progressId);
}
