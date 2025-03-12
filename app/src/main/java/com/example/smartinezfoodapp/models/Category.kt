package com.example.smartinezfoodapp.models

import java.sql.Date

data class Category(
    val id : Int,
    val category: String,
    val image : String,
)

public val categoryList = listOf(
    Category(
        id = 1,
        category = "Fast Food",
        image = "https://cdn-icons-png.flaticon.com/512/9417/9417083.png"
    ),

    Category(
        id = 2,
        category = "Italian",
        image = "https://cdn-icons-png.flaticon.com/512/6045/6045709.png"
    ),

    Category(
        id = 3,
        category = "Chinese",
        image = "https://cdn-icons-png.flaticon.com/512/1046/1046791.png"
    ),

    Category(
        id = 3,
        category = "Indian",
        image = "https://cdn-icons-png.flaticon.com/512/3014/3014404.png"
    ),

    Category(
        id = 4,
        category = "Mexican",
        image = "https://cdn-icons-png.flaticon.com/512/1054/1054508.png"
    )
)