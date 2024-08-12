package com.example.toyotaproject.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.toyotaproject.ui.screens.AddNoteScreen
import com.example.toyotaproject.ui.screens.ListScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("second") }) {
                Icon(Icons.Filled.Add, contentDescription = "Add Note")
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "first",
            Modifier.padding(innerPadding)
        ) {
            composable("first") {
                ListScreen()
            }
            composable("second") {
                AddNoteScreen(navController = navController)
            }
        }
    }
}



