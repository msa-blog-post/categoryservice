package com.choi.categoryservice.service

import com.choi.categoryservice.dto.Category
import com.choi.categoryservice.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val categoryRepository: CategoryRepository) {

    fun createCategory(category: Category): Category {
        return categoryRepository.save(category)
    }

    fun getCategoryById(id: Long): Category {
        return categoryRepository.findById(id).orElseThrow { RuntimeException("Category not found") }
    }

    fun deleteCategory(id: Long) {
        categoryRepository.deleteById(id)
    }

    fun getAllCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}