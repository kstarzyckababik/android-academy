package com.goandroid

import android.content.Context

class ProgressManager(context: Context) {

    private val prefs = context.getSharedPreferences("progress", Context.MODE_PRIVATE)


//    init {
//        prefs.edit().clear().apply()
//    }
    //- for tests, reset progress


    fun getCompleted(): Set<Int> {
        return prefs.getStringSet("completed", emptySet())
            ?.map { it.toInt() }
            ?.toSet() ?: emptySet()
    }

    fun saveCompleted(set: Set<Int>) {
        prefs.edit()
            .putStringSet("completed", set.map { it.toString() }.toSet())
            .apply()
    }
}