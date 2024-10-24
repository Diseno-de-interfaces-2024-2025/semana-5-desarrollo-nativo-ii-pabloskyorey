package com.example.ejercicio1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun screen(modifier: Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 15.dp).fillMaxWidth()) {
        item {
            SectionItem(title = "Gimnasio", imageRes = R.drawable.gimnasio)
        }
        item {
            SectionItem(title = "Fútbol", imageRes = R.drawable.futbol)
        }
        item {
            SectionItem(title = "Tenis", imageRes = R.drawable.tenis)
        }
        item {
            SectionItem(title = "Crossfit", imageRes = R.drawable.crossfit)
        }
    }
}

@Composable
fun SectionItem(title: String, imageRes: Int) {
    Column(Modifier.fillMaxWidth()) {
        Text(title, Modifier.align(Alignment.CenterHorizontally))
        Box(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(shape = RoundedCornerShape(20.dp))
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = "Imagen de $title",
                contentScale = ContentScale.Crop
            )
        }
    }
}
