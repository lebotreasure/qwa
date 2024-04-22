package com.enviro.assessment.grad001.lebohangkhaeane.service;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Tip;
import com.enviro.assessment.grad001.lebohangkhaeane.repository.TipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipServiceImpl implements TipService{

    final private TipRepository tipRepository;

    public TipServiceImpl(TipRepository tipRepository) {
        this.tipRepository = tipRepository;
    }

    @Override
    public List<Tip> findAllTips() {
        return tipRepository.findAll();
    }

    @Override
    public List<Tip> findTipsByCategoryId(Long categoryId) {
        return tipRepository.findByCategoryId(categoryId);
    }

    @Override
    public Tip saveTip(Tip tip) {
        return tipRepository.save(tip);
    }

    @Override
    public Tip updateTip(Long id, Tip tip) {
        return tipRepository.findById(id)
                .map(existingTip -> {
                    existingTip.setContent(tip.getContent());
                    existingTip.setCategoryId(tip.getCategoryId());
                    return tipRepository.save(existingTip);
                }).orElseThrow(() -> new RuntimeException("Tip not found"));
    }

    @Override
    public void deleteTip(Long id) {
        tipRepository.deleteById(id);
    }
}
