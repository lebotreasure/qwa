package com.enviro.assessment.grad001.lebohangkhaeane.service;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Guideline;
import com.enviro.assessment.grad001.lebohangkhaeane.repository.GuidelineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuidelineServiceImpl implements GuidelineService{

    final private GuidelineRepository guidelineRepository;

    public GuidelineServiceImpl(GuidelineRepository guidelineRepository) {
        this.guidelineRepository = guidelineRepository;
    }
    @Override
    public List<Guideline> findGuidelinesByCategoryId(Long categoryId) {
        return guidelineRepository.findByCategoryId(categoryId);
    }

    @Override
    public Guideline saveGuideline(Guideline guideline) {
        return guidelineRepository.save(guideline);
    }

    @Override
    public Guideline updateGuideline(Long id, Guideline guideline) {
        return guidelineRepository.findById(id)
                .map(existingGuideline -> {
                    existingGuideline.setDescription(guideline.getDescription());
                    existingGuideline.setCategoryId(guideline.getCategoryId());
                    return guidelineRepository.save(existingGuideline);
                }).orElseThrow(() -> new RuntimeException("Guideline not found"));
    }

    @Override
    public void deleteGuideline(Long id) {
        guidelineRepository.deleteById(id);
    }
}
