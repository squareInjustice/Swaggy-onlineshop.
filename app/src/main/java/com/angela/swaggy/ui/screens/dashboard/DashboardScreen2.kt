package com.angela.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.angela.swaggy.ui.theme.teal



@Composable
fun DashboardScreen2(navController: NavController) {


    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(350.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp),
            colors = CardDefaults.cardColors(teal)
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Cryptocurrency",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    text = "Landing Page",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )


                //Row
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(R.drawable.samantha),
                        contentDescription = "samantha",
                        modifier = Modifier.size(width = 40.dp, height = 40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "Samantha",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                }

                //End of row


                //Row
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Secure your future with the world’s most trusted cryptocurrency platform.Buy, sell, and trade digital assets instantly — anytime, anywhere.Join millions building wealth through the power of blockchain.",
                        fontSize = 15.sp,
                        color = Color.White,
                        modifier = Modifier.width(200.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.man),
                        contentDescription = "man holding a laptop",
                        modifier = Modifier
                            .size(250.dp),
                        contentScale = ContentScale.Crop
                    )


                } //End of row

                //Row
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column() {

                        Image(
                            painter = painterResource(R.drawable.samantha),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Samantha",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Text(
                            text = "Samantha",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,

                           color = Color.White
                        )

                    }

                }

                //End of row


                //Row
                Row {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.layout1),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }

                    Column {
                        Image(
                            painter = painterResource(R.drawable.presentation),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }

                    Column {
                        Image(
                            painter = painterResource(R.drawable.assets),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }


                }//End of row

                //Row
                Row {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.layout2),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }

                    Column {
                        Image(
                            painter = painterResource(R.drawable.samantha),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }

                    Column {
                        Image(
                            painter = painterResource(R.drawable.samantha),
                            contentDescription = "samantha",
                            modifier = Modifier.size(width = 40.dp, height = 40.dp).clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Layout Docs",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )

                        Text(
                            text = "PDF 10MB",
                            fontSize = 15.sp

                        )

                    }


                }//End of row








            }


        }
        //End of card


    }
    //End of column
}
@Preview(showBackground = true)
@Composable

fun DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())
}