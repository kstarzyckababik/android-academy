package com.goandroid.domain.model

data class Subcategory(
    val id: Int,
    val name: String,
    val questions: List<Question>
)