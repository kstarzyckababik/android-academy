package com.goandroid.ui.screens.home

import android.app.Application
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.AndroidViewModel

import com.goandroid.ProgressManager
import com.goandroid.data.SampleData


class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val manager = ProgressManager(application)
    private val _completed = mutableStateListOf<Int>()


    init {
        _completed.addAll(manager.getCompleted())
    }

    fun complete(subcategoryId: Int) {
        if (!_completed.contains(subcategoryId)) {
            _completed.add(subcategoryId)
            manager.saveCompleted(_completed.toSet())
        }
    }

    fun isUnlocked(previousId: Int?): Boolean {
        return previousId == null || _completed.contains(previousId)
    }


    fun getProgress(): Float {
        val total = SampleData.categories.flatMap { it.subcategories }.size
        if (total == 0) return 0f
        return _completed.size.toFloat() / total.toFloat()
    }

    fun getProgressPercent(): Int {
        return (getProgress() * 100).toInt()
    }

    fun isCategoryUnlocked(categoryIndex: Int): Boolean {
        if (categoryIndex == 0) return true
        val previousCategory = SampleData.categories[categoryIndex - 1]
        return previousCategory.subcategories.all { _completed.contains(it.id) }
    }


}



