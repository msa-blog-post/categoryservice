package com.choi.categoryservice.controller

import com.choi.categoryservice.dto.Category
import com.choi.categoryservice.service.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryService: CategoryService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCategory(@RequestBody category: Category): Category {
        return categoryService.createCategory(category)
    }

    @GetMapping("/{id}")
    fun getCategoryById(@PathVariable id: Long): Category {
        return categoryService.getCategoryById(id)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCategory(@PathVariable id: Long) {
        categoryService.deleteCategory(id)
    }

    @GetMapping
    fun getAllCategories(): List<Category> {
        return categoryService.getAllCategories()
    }
}