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
public class Tip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Category ID cannot be null")
    private Long categoryId;

    @NotBlank(message = "Content cannot be blank")
    @Size(min = 10, max = 500, message = "Content must be between 10 and 500 characters")
    private String content;
}
