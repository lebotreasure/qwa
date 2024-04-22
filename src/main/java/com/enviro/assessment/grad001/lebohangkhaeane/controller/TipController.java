package com.enviro.assessment.grad001.lebohangkhaeane.controller;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Tip;
import com.enviro.assessment.grad001.lebohangkhaeane.service.TipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recyclingTips")
public class TipController {

    final private TipService tipService;

    public TipController(TipService tipService) {
        this.tipService = tipService;
    }

    @GetMapping
    public ResponseEntity<List<Tip>> getAllRecyclingTips() {
        return ResponseEntity.ok(tipService.findAllTips());
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<List<Tip>> getRecyclingTipsByCategoryId(@PathVariable Long categoryId) {
        List<Tip> tips = tipService.findTipsByCategoryId(categoryId);
        return ResponseEntity.ok(tips);
    }

    @PostMapping
    public ResponseEntity<Tip> createRecyclingTip(@RequestBody Tip tip) {
        Tip newTip = tipService.saveTip(tip);
        return ResponseEntity.ok(newTip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tip> updateRecyclingTip(@PathVariable Long id, Tip tip) {
        Tip updatedTip = tipService.updateTip(id, tip);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        tipService.deleteTip(id);
        return ResponseEntity.ok().build();
    }
}
