package com.devnico.blog.services;

import com.devnico.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategories();

    Category createCategory(Category category);
}
