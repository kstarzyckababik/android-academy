package com.goandroid.domain.model

data class Question(
    val id: Int,
    val question: String,
    val answers: List<String>,
    val correctAnswerIndex: Int
)