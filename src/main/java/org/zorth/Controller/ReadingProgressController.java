package org.zorth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zorth.Service.ReadingProgressService;
import org.zorth.pojo.ReadingProgress;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/reading-progress")
public class ReadingProgressController {

    @Autowired
    private ReadingProgressService readingProgressService;

    @GetMapping("/{progressId}")
    public ReadingProgress getProgressById(@PathVariable int progressId) {
        return readingProgressService.getProgressById(progressId);
    }

    @PostMapping
    public ReadingProgress addProgress(@RequestBody ReadingProgress progress) {
        return readingProgressService.addProgress(progress);
    }

    @PutMapping("/{progressId}")
    public ReadingProgress updateProgress(@PathVariable int progressId, @RequestBody ReadingProgress progress) {
        progress.setProgressId(progressId);
        return readingProgressService.updateProgress(progress);
    }

    @DeleteMapping("/{progressId}")
    public void deleteProgress(@PathVariable int progressId) {
        readingProgressService.deleteProgress(progressId);
    }
}
