package com.example.smartinezfoodapp.models

import android.media.Rating
import java.sql.Date

data class Food(
    val id : Int,
    val name: String,
    val image : String,
    val rating: Float,
    val price: Float
)

public val foodList = listOf(
    Food(
        id = 1,
        name = "Whopper",
        rating = 4.5f,
        image = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_JR_500X540px.png",
        price = 5.99f
    ),

    Food(
        id = 2,
        name = "Chicken",
        image = "https://static.vecteezy.com/system/resources/thumbnails/036/627/221/small_2x/ai-generated-golden-crispy-chicken-tenders-on-transparent-background-png.png",
        rating = 4.5f,
        price = 6.99f
    ),

    Food(
        id = 3,
        name = "Noodles",
        image = "https://png.pngtree.com/png-clipart/20240510/original/pngtree-instant-fried-noodles-png-image_15059696.png",
        rating = 5.0f,
        price = 9.99f
    ),

    Food(
        id = 3,
        name = "Sandwich",
        image = "https://static.vecteezy.com/system/resources/thumbnails/041/277/336/small_2x/ai-generated-sandwich-with-ham-cheese-tomatoes-and-lettuce-isolated-on-transparent-background-png.png",
        rating = 4.3f,
        price = 10.99f
    ),

    Food(
        id = 4,
        name = "Wings",
        image = "https://png.pngtree.com/png-clipart/20231018/original/pngtree-the-buffalo-wing-chronicles-transpreant-background-png-image_13354459.png",
        rating = 5.0f,
        price = 12.99f
    )
)