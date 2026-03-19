package com.goandroid.data.local

import androidx.room.*

@Dao
interface ProgressDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(progress: ProgressEntity)

    @Query("SELECT * FROM progress")
    suspend fun getAll(): List<ProgressEntity>

    @Query("SELECT * FROM progress WHERE subcategoryId = :id")
    suspend fun getById(id: Int): ProgressEntity?
}