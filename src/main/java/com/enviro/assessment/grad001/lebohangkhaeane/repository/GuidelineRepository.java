package com.enviro.assessment.grad001.lebohangkhaeane.repository;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Guideline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuidelineRepository extends JpaRepository<Guideline, Long> {
    List<Guideline> findByCategoryId(Long categoryId);
}
