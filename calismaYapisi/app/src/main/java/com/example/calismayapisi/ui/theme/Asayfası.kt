package com.example.calismayapisi.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Asayfasi (navController: NavController) {
    Column (modifier = Modifier.
    fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "A Sayfası", fontSize = 50.sp)
            Button(onClick = {
                navController.navigate("Bsayfasi")
            }
            ) {
                Text(text = "B sayfasına git")

            }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Geri dön")
        }
    }
}