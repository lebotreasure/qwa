package com.enviro.assessment.grad001.lebohangkhaeane.service;

import com.enviro.assessment.grad001.lebohangkhaeane.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAllCategories();
    Optional<Category> findCategoryById(Long id);
    Category saveCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
