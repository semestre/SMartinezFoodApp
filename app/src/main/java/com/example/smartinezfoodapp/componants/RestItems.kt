package com.example.smartinezfoodapp.componants

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.smartinezfoodapp.models.restaurantList

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestItems() {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
    ) {
        items(restaurantList) { restaurant ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(8.dp)
            ) {

                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(Color.Transparent)
                        .border(3.dp, Color.Transparent, CircleShape)
                ) {

                    GlideImage(
                        model = restaurant.image,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

                Text(
                    text = restaurant.name,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }

}