package com.goandroid.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "progress")
data class ProgressEntity(
    @PrimaryKey val subcategoryId: Int,
    val isCompleted: Boolean
)