package com.enviro.assessment.grad001.lebohangkhaeane.controller;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Guideline;
import com.enviro.assessment.grad001.lebohangkhaeane.service.GuidelineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/guidelines")
public class GuidelineController {

    final private GuidelineService guidelineService;

    public GuidelineController(GuidelineService guidelineService) {
        this.guidelineService = guidelineService;
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<List<Guideline>> getGuidelinesByCategoryId(@PathVariable Long categoryId) {
        List<Guideline> guidelines = guidelineService.findGuidelinesByCategoryId(categoryId);
        return ResponseEntity.ok(guidelines);
    }

    @PostMapping
    public ResponseEntity<Guideline> addGuideline(@RequestBody Guideline guideline) {
        Guideline newGuideline = guidelineService.saveGuideline(guideline);
        return ResponseEntity.ok(newGuideline);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guideline> updateGuideline(@PathVariable Long id, @RequestBody Guideline guideline) {
        Guideline updatedGuideline = guidelineService.updateGuideline(id, guideline);
        return ResponseEntity.ok(updatedGuideline);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuideline(@PathVariable Long id) {
        guidelineService.deleteGuideline(id);
        return ResponseEntity.ok().build();
    }
}
