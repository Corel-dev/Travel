package com.example.easyt.ui.theme.screens.dashscreen

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.easyt.R
import com.example.easyt.ui.theme.EasyTTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()) {
        //TopAppBar
        TopAppBar(title = {
            Text(
                text = "EasyT",
                color = Color.Black,
                fontFamily = FontFamily.Cursive
            )
        },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Menu, contentDescription = "",
                        tint = Color.Black
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications, contentDescription = "share",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle, contentDescription = "add",
                        tint = Color.Black
                    )
                }
            })
        Text(
            text = "Explore the",
            fontSize = 35.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = "Beautiful World",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 20.dp, top = 3.dp)
        )
        Spacer(modifier = Modifier.width(100.dp))
        var search by remember {
            mutableStateOf("")
        }
        Spacer(modifier = Modifier.height(5.dp))
        //Column 1
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .padding(25.dp)
            ) {
                Column {
                    Card(onClick = { /*TODO*/ },modifier = Modifier
                        .height(85.dp)
                        .width(150.dp)) {
                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_3),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    androidx.compose.material3.Text(
                                        text = "Hotel",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 25.dp)
                                    )
                                }

                            }
                        }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Card(onClick = { /*TODO*/ },modifier = Modifier
                        .height(85.dp)
                        .width(155.dp)) {
                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6,),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    androidx.compose.material3.Text(
                                        text = "Holiday",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 25.dp)
                                    )
                                }

                            }
                    }
                }
            }
        }
        //End of column 1
        //column 2
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .padding(25.dp)
            ) {
                Column {
                   Card(onClick = { /*TODO*/ },modifier = Modifier
                       .height(85.dp)
                       .width(150.dp)) {

                           Box {
                               Image(
                                   painter = painterResource(id = R.drawable.img_9),
                                   contentDescription = "Tokyo",
                                   modifier = Modifier
                                       .padding(start = 10.dp, top = 20.dp)
                                       .clip(shape = CircleShape)
                               )

                               Column {
                                   androidx.compose.material3.Text(
                                       text = "Taxi",
                                       fontWeight = FontWeight.Bold,
                                       fontSize = 20.sp,
                                       modifier = Modifier
                                           .padding(start = 105.dp, top = 30.dp)
                                   )
                               }

                           }
                   }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Card(onClick = { /*TODO*/ },modifier = Modifier
                        .height(85.dp)
                        .width(155.dp)) {

                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_8,),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 20.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    androidx.compose.material3.Text(
                                        text = "Tickets",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 30.dp)
                                    )
                                }

                            }
                    }
                }
            }
        }
        //End of column 2
        //column 3
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .padding(25.dp)
            ) {
                Column {
                   Card(onClick = { /*TODO*/ }, modifier = Modifier
                       .height(85.dp)
                       .width(150.dp)) {

                           Box {
                               Image(
                                   painter = painterResource(id = R.drawable.img_10),
                                   contentDescription = "Tokyo",
                                   modifier = Modifier
                                       .padding(start = 10.dp, top = 15.dp)
                                       .clip(shape = CircleShape)
                               )

                               Column {
                                   androidx.compose.material3.Text(
                                       text = "Plane",
                                       fontWeight = FontWeight.Bold,
                                       fontSize = 20.sp,
                                       modifier = Modifier
                                           .padding(start = 88.dp, top = 25.dp)
                                   )
                               }

                           }
                   }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Card(onClick = { /*TODO*/ }, modifier = Modifier
                        .height(85.dp)
                        .width(155.dp)) {

                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_11,),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    androidx.compose.material3.Text(
                                        text = "Harbour",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 19.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 25.dp)
                                    )
                                }

                            }
                    }
                }
                //end of TopAppBar
            }
        }
        //End of column 1
        //End of searchbar
        Spacer(modifier = Modifier.height(120.dp))
        BottomAppBar(contentColor = Color.Blue, actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications, contentDescription = "share",
                        tint = Color.Black
                    )
                }
            })
    }
}
@Composable
@Preview(showBackground = true)
fun DashScreenPreview() {
    EasyTTheme {
        DashScreen(navController = rememberNavController())
    }
}