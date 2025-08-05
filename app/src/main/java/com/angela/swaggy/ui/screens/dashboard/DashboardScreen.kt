package com.angela.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.angela.swaggy.R
import com.angela.swaggy.ui.theme.hotpink
import com.angela.swaggy.ui.theme.lightgrey


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = hotpink,
                modifier = Modifier.offset(y=50.dp),
                shape = CircleShape
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,

        //content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                Column(
                    modifier = Modifier
                        .background(lightgrey)
                ) {
                    //Main Contents of the page
                    Row(
                        modifier = Modifier
                            .fillMaxWidth().height(200.dp)
                            .background(Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 12.dp, top = 60.dp)
                        ) {
                            Text(
                                text = "Hi Samantha",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,

                                )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Here are your projects",
                                fontSize = 15.sp,

                                )
                        }
                        Spacer(modifier = Modifier.width(30.dp))


                        Image(
                            painter = painterResource(R.drawable.bookgirl),
                            contentDescription = "girl",
                            modifier = Modifier.height(200.dp).width(200.dp).clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))


                    //Row
                    Row(

                        modifier = Modifier
                            .background(Color.White)
                            .padding(start = 12.dp)
                            .horizontalScroll(rememberScrollState())
                    ) {

                        //Card
                        Card(
                            onClick = {},
                            modifier = Modifier.width(200.dp).height(350.dp),
                            elevation = CardDefaults.elevatedCardElevation(3.dp),
                            //colors = CardDefaults.cardColors(orange1)
                        ) {

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .paint(
                                        painter = painterResource(R.drawable.background2),
                                        contentScale = ContentScale.FillBounds
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Column() {

                                    Image(
                                        painter = painterResource(R.drawable.crypto1),
                                        contentDescription = "sneaker1",
                                        modifier = Modifier.size(150.dp)

                                    )
                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text(
                                        text = "Cryptocurrency",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )

                                    Spacer(modifier = Modifier.height(5.dp))

                                    Text(
                                        text = "Landing Page",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )
                                }
                            }

                        }

                        //End of card
                        Spacer(modifier = Modifier.width(10.dp))


                        //Card
                        Card(
                            onClick = {},
                            modifier = Modifier.width(200.dp).height(350.dp),
                            elevation = CardDefaults.elevatedCardElevation(3.dp),
                            //colors = CardDefaults.cardColors(orange1)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .paint(
                                        painter = painterResource(R.drawable.stat),
                                        contentScale = ContentScale.FillBounds
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Column() {

                                    Image(
                                        painter = painterResource(R.drawable.stat1),
                                        contentDescription = "sneaker2",


                                        )
                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text(
                                        text = "Statistics",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )

                                    Spacer(modifier = Modifier.height(5.dp))

                                    Text(
                                        text = "Dashboard",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )
                                }
                            }

                        }

                        //End of card
                        Spacer(modifier = Modifier.width(10.dp))


                        //Card
                        Card(
                            onClick = {},
                            modifier = Modifier.width(200.dp).height(250.dp),
                            elevation = CardDefaults.elevatedCardElevation(3.dp),
                            //colors = CardDefaults.cardColors(orange1)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .paint(
                                        painter = painterResource(R.drawable.background3),
                                        contentScale = ContentScale.FillBounds
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Column(
                                    modifier =  Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center

                                ) {

                                    Image(
                                        painter = painterResource(R.drawable.sneaker3),
                                        contentDescription = "dress",

                                        )

                                    Text(
                                        text = "Cryptocurrency",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )

                                    Spacer(modifier = Modifier.height(5.dp))

                                    Text(
                                        text = "Landing Page",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White

                                    )
                                }
                            }

                        }

                        //End of card
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                    //End of Row


                    Column(

                    ) {
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Personal Tasks",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,

                            )

                        Spacer(modifier = Modifier.height(20.dp))

                        //Row
                        Card(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, end = 20.dp)
                                .background(Color.White)
                        )

                        {
                            Image(
                                painter = painterResource(R.drawable.videocamera),
                                contentDescription = "videocamera",
                                modifier = Modifier.size(width = 70.dp, height = 70.dp)
                                    .clip(shape = RoundedCornerShape(10.dp)),
                                contentScale = ContentScale.Crop

                            )
                            Spacer(modifier = Modifier.width(10.dp))

                            Column() {
                                Text(
                                    text = "NDA Review for website project",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(text = "Today- 10pm", fontSize = 15.sp)
                                Spacer(modifier = Modifier.height(10.dp))


                            }


                        }

                    }
                    //End of row

                    Spacer(modifier = Modifier.height(10.dp))
                    //Row
                    Card(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .background(Color.White)
                    )

                    {

                        Image(
                            painter = painterResource(R.drawable.email),
                            contentDescription = "email",
                            modifier = Modifier.size(width = 70.dp, height = 70.dp)
                                .clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop

                        )
                        Spacer(modifier = Modifier.width(10.dp))

                        Column() {
                            Text(
                                text = "Email Reply for Green Project",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "Today- 10pm", fontSize = 15.sp)
                            Spacer(modifier = Modifier.height(10.dp))


                        }


                    }


                }
            }
        }
    ) //End of scaffold

}

@Preview(showBackground = true)
@Composable

fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}