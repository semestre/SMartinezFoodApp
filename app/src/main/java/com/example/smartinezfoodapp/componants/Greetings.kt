package com.example.smartinezfoodapp.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.smartinezfoodapp.icons.Logout
import com.example.smartinezfoodapp.icons.UserRound
import com.example.smartinezfoodapp.ui.theme.Orange


@Composable
fun Greetings(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(), // Make sure Row fills the available width
        horizontalArrangement = Arrangement.SpaceBetween // Distributes items with space between
    ) {
        Box(
            modifier = Modifier
                .padding(end = 8.dp) // Optional padding for spacing between the two Boxes
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Transparent)
                        .border(3.dp, Orange, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(imageVector = UserRound, contentDescription = null)
                }

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "Hello Teacher",
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray)
            }
        }

        // Second Box
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.Transparent)
                .border(3.dp, Color.Transparent, CircleShape),
            contentAlignment = Alignment.Center
        ){
            Image(imageVector = Logout, contentDescription = null)
        }
    }
}