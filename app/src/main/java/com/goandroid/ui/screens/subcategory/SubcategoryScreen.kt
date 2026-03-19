package com.goandroid.ui.screens.subcategory

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.goandroid.domain.model.Category
import com.goandroid.domain.model.Subcategory
import com.goandroid.ui.screens.home.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubcategoryScreen(
    category: Category,
    homeViewModel: HomeViewModel,
    onBack: () -> Unit,
    onClick: (Subcategory) -> Unit
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { onBack() },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = category.name,
                style = MaterialTheme.typography.headlineMedium
            )
        }



        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Choose a topic",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))


        category.subcategories.forEachIndexed { index, sub ->

            val previousId = category.subcategories.getOrNull(index - 1)?.id
            val unlocked = homeViewModel.isUnlocked(previousId)

            Card(
                onClick = { if (unlocked) onClick(sub) },
                enabled = unlocked,
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    val icon = if (unlocked) "" else "🔒"

                    if (icon.isNotEmpty()) {
                        Text(
                            text = icon,
                            style = MaterialTheme.typography.headlineSmall
                        )

                        Spacer(modifier = Modifier.width(12.dp))
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = sub.name,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Text(
                            text = if (unlocked)
                                "Tap to start quiz"
                            else
                                "Complete previous topic",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray
                        )
                    }


                    Text(
                        text = "→",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}