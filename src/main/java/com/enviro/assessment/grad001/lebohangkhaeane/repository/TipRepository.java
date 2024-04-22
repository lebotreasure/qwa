package com.enviro.assessment.grad001.lebohangkhaeane.repository;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Tip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipRepository extends JpaRepository<Tip, Long> {
    List<Tip> findByCategoryId(Long categoryId);
}
