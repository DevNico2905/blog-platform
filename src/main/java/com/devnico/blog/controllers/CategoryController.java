package com.devnico.blog.controllers;

import com.devnico.blog.domain.dtos.CategoryDto;

import com.devnico.blog.domain.entities.Category;
import com.devnico.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories(){
        List<Category> categories = categoryService.listCategories();
        return null;
    }
}
