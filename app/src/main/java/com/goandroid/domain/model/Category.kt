package com.goandroid.domain.model

data class Category(
    val id: Int,
    val name: String,
    val subcategories: List<Subcategory>
)