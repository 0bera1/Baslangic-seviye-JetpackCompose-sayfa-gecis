package com.example.calismayapisi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.calismayapisi.ui.theme.Asayfasi
import com.example.calismayapisi.ui.theme.Bsayfasi
import com.example.calismayapisi.ui.theme.CalismaYapisiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalismaYapisiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SayfaGecisleri()
                }
            }
        }
    }
}

@Composable
fun SayfaGecisleri () {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa") {
            Anasayfa(navController = navController)
        }
        composable("Asayfasi"){
            Asayfasi(navController = navController)
        }
        composable("Bsayfasi"){
            Bsayfasi(navController = navController)
        }
        
    }

}

@Composable
fun Anasayfa(navController: NavController) {
     val sayac = remember {
         mutableStateOf(0)
     }
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Anasayfa ", fontSize = 50.sp)
        
        Button(onClick ={
            navController.navigate("Asayfasi")
        }) {
            Text(text = "A sayfasına git")
        }
        Text(text = "Sayaç : ${sayac.value}")
    
        Button(onClick = {
            sayac.value+=1
        }) {
                Text(text = "Tıkla")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalismaYapisiTheme {

    }
}