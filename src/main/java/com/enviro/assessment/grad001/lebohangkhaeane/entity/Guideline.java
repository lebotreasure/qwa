package com.enviro.assessment.grad001.lebohangkhaeane.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Guideline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Category ID is required")
    private Long categoryId;

    @NotBlank(message = "Guideline description cannot be blank")
    @Size(min = 20, max = 1000, message = "Description must be between 20 and 1000 characters")
    private String description;
}
