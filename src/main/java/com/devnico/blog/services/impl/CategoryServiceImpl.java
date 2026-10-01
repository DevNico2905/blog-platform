package com.devnico.blog.services.impl;

import com.devnico.blog.domain.entities.Category;
import com.devnico.blog.repositories.CategoryRepository;
import com.devnico.blog.services.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }

    @Override
    @Transactional
    public Category createCategory(Category category) {
         if (categoryRepository.existsByNameIgnoreCase(category.getName())){
             throw new IllegalArgumentException("Category already exists with name: " + category.getName());
         }

         return categoryRepository.save(category);
    }
}
