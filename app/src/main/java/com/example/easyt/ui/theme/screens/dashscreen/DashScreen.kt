package com.example.easyt.ui.theme.screens.dashscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()){
        //TopAppBar
        TopAppBar(title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "arrowback",
                        tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "share",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "add",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                        tint = Color.Black)
                }
            })
        //end of TopAppBar
        var search by remember {
            mutableStateOf("")
        }
        Text(text = "Explore the",
            fontSize = 35.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp))
        Text(text = "Beautiful World",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 20.dp, top = 3.dp))
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { Text(text = "What is your next destination") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") }
        )
    }
}
@Composable
@Preview(showBackground = true)
fun DashScreenPreview() {
    EasyTravelsTheme {
        DashScreen(navController = rememberNavController())
    }
}