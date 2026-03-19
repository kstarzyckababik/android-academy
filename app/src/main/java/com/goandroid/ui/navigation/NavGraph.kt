package com.goandroid.ui.navigation


import androidx.compose.runtime.Composable

import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.goandroid.data.SampleData
import com.goandroid.ui.screens.home.HomeScreen
import com.goandroid.ui.screens.home.HomeViewModel

import com.goandroid.ui.screens.quiz.QuizScreen

import com.goandroid.ui.screens.subcategory.SubcategoryScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    val homeViewModel: HomeViewModel = viewModel()

    NavHost(navController, startDestination = "home") {

        composable("home") {
            HomeScreen(homeViewModel) { category ->
                navController.navigate("subcategory/${category.id}")
            }
        }

        composable("subcategory/{categoryId}") { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId")?.toIntOrNull()

            val category = SampleData.categories.firstOrNull { it.id == categoryId }


            if (category != null) {
                SubcategoryScreen(
                    category = category,
                    homeViewModel = homeViewModel,
                    onBack = { navController.popBackStack() }
                ) { sub ->
                    navController.navigate("quiz/${sub.id}")
                }
            }
        }

        composable("quiz/{subcategoryId}") { backStackEntry ->
            val subId = backStackEntry.arguments?.getString("subcategoryId")?.toIntOrNull()

            val subcategory = SampleData.categories
                .flatMap { it.subcategories }
                .firstOrNull { it.id == subId }

            if (subcategory != null) {
                QuizScreen(
                    subcategory = subcategory,
                    homeViewModel = homeViewModel,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}