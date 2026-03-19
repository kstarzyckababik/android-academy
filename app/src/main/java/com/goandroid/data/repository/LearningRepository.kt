package com.goandroid.data.repository

import com.goandroid.data.local.ProgressDao
import com.goandroid.data.local.ProgressEntity

//class LearningRepository(
//    private val dao: ProgressDao
//) {
//
//    suspend fun saveProgress(subcategoryId: Int) {
//        dao.insert(ProgressEntity(subcategoryId, true))
//    }
//
//    suspend fun getCompleted(): List<ProgressEntity> {
//        return dao.getAll()
//    }
//}