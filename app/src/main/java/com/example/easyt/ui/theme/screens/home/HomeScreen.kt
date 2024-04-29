package com.example.easyt.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.easyt.R
import com.example.easyt.navigation.SECONDSCREEN_URL
import com.example.easyt.ui.theme.EasyTTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.img_4), contentScale = ContentScale.FillHeight)
    ) {
        Text(text = "Let's make",
            fontSize = 50.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 13.dp, top = 70.dp))
        Text(text = "your dream",
            fontSize = 50.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 13.dp))
        Text(text = "vacation",
            fontSize = 50.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 13.dp))
        Row {
            Button(
                onClick = {navController.navigate(SECONDSCREEN_URL)},
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 100.dp, end = 100.dp, top = 450.dp)
                    .fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "next",
                    tint = Color.White
                )
                Text(text = "Continue")
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    EasyTTheme {
        HomeScreen(navController = rememberNavController())
    }
}