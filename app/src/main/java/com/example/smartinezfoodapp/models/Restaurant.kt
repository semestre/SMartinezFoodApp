package com.example.smartinezfoodapp.models

import java.sql.Date

data class Restaurant(
    val id : Int,
    val name: String,
    val image : String,
)

public val restaurantList = listOf(
    Restaurant(
        id = 1,
        name = "Mc,Donalds",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/McDonald%27s_logo.svg/220px-McDonald%27s_logo.svg.png"
    ),

    Restaurant(
        id = 2,
        name = "KFC",
        image = "https://cdn.iconscout.com/icon/free/png-256/free-kfc-2-226243.png"
    ),

    Restaurant(
        id = 3,
        name = "Panda Express",
        image = "https://1000logos.net/wp-content/uploads/2024/01/Panda-Express-Logo.png"
    ),

    Restaurant(
        id = 3,
        name = "SubWay",
        image = "https://brandlogos.net/wp-content/uploads/2021/05/subway-logo.png"
    ),

    Restaurant(
        id = 4,
        name = "Wing Stop",
        image = "https://1000marcas.net/wp-content/uploads/2024/08/Wingstop-Emblem.png"
    )
)