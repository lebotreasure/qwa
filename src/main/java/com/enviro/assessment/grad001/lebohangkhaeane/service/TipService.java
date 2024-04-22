package com.enviro.assessment.grad001.lebohangkhaeane.service;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Tip;

import java.util.List;

public interface TipService {
    List<Tip> findAllTips();
    List<Tip> findTipsByCategoryId(Long categoryId);
    Tip saveTip(Tip tip);
    Tip updateTip(Long id, Tip tip);
    void deleteTip(Long id);
}
