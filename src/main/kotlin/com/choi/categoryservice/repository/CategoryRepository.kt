package com.choi.categoryservice.repository

import com.choi.categoryservice.dto.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Long>