package com.example.aggim.domain.product

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.domain.Pageable

interface ProductRepository : JpaRepository<Product, Long> {
    fun findByCategoryIdAndIdGreaterThanOrderByIdDesc(
        categoryId: Int?, id: Long, pageable: Pageable
    ): List<Product>

    fun findByCategoryIdAndIdLessThanOrderByIdDesc(
        categoryId: Int?, id: Long, pageable: Pageable
    ): List<Product>

    fun findByIdGreaterThanAndNameLikeOrderByIdDesc(
        id: Long, keyword: String, pageable: Pageable
    ): List<Product>

    fun findByIdLessThanAndNameLikeOrderByIdDesc(
        id: Long, keyword: String, pageable: Pageable
    ): List<Product>

}