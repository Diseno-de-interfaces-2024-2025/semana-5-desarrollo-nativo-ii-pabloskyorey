package com.example.ejercicio1.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.R

@Composable
fun screen(modifier: Modifier){
    LazyColumn (modifier = modifier.padding(horizontal = 15.dp).fillMaxWidth()) {
        item{
            Column(Modifier.fillMaxWidth()){
                Text("Gimnasio", Modifier.align(Alignment.CenterHorizontally))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                ){
                    Image(
                        painter = painterResource(R.drawable.gimnasio), // Cambia "mi_imagen" al nombre de tu archivo
                        contentDescription = "Descripción de la imagen", // Puedes añadir una descripción
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}
