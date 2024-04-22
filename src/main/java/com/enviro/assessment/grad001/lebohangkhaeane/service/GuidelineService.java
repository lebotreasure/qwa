package com.enviro.assessment.grad001.lebohangkhaeane.service;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Guideline;

import java.util.List;

public interface GuidelineService {
    List<Guideline> findGuidelinesByCategoryId(Long categoryId);
    Guideline saveGuideline(Guideline guideline);
    Guideline updateGuideline(Long id, Guideline guideline);
    void deleteGuideline(Long id);
}
