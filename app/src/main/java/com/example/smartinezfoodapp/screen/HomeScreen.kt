package com.example.smartinezfoodapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.smartinezfoodapp.componants.BestSellers
import com.example.smartinezfoodapp.componants.CategoryItem
import com.example.smartinezfoodapp.componants.Greetings
import com.example.smartinezfoodapp.componants.RestItems
import com.example.smartinezfoodapp.icons.Logout
import com.example.smartinezfoodapp.icons.StarFilled
import com.example.smartinezfoodapp.icons.UserRound
import com.example.smartinezfoodapp.models.categoryList
import com.example.smartinezfoodapp.models.foodList
import com.example.smartinezfoodapp.models.restaurantList
import com.example.smartinezfoodapp.ui.theme.Orange
import com.example.smartinezfoodapp.ui.theme.SMartinezFoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {

        // Row for "Hello Teacher" and the box
        Greetings()

        // Add Spacer to separate the "Hello Teacher" section from the categories
        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Categories",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(2.dp)
        )

        CategoryItem()

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Find the Best \n " +
                    "Restaurants",
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            fontSize = 18.sp,
            style = TextStyle(textDecoration = TextDecoration.None),
            modifier = Modifier
                .padding(8.dp)
        )

        RestItems()

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Our Best Sellers",
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(2.dp)
        )

        BestSellers()


    }
}



@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)
@Composable
fun HomeScreenPreview() {
    SMartinezFoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}
