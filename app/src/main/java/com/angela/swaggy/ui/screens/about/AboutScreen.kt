package com.angela.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.angela.swaggy.R
import com.angela.swaggy.ui.theme.orange1
import com.angela.swaggy.ui.theme.orange2

@Composable
fun AboutScreen(navController: NavController){

    Column(

        modifier = Modifier.fillMaxSize().background(orange2),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Image(
            painter = painterResource(R.drawable.icon3),
            contentDescription = "icon3",
            modifier = Modifier.size(80.dp)

        )
        Spacer(modifier = Modifier.size(16.dp))


        Text(
            text = "Easy Shopping",
            fontSize = 25.sp,
            color = orange1,
            fontWeight = FontWeight.Bold,

            )

        Text(
            text = "Browse, tap, and buy in seconds—shopping made simple with Swaggy.",
            fontSize = 17.sp,
            textAlign = TextAlign.Center

            )

        Spacer(modifier = Modifier.size(16.dp))

    }
    Row(
        modifier = Modifier.padding(start = 20.dp, top = 700.dp)

    ) {
        Box(modifier = Modifier.size(8.dp).background(orange1))
        Spacer(modifier = Modifier.width(10.dp))

        Box(modifier = Modifier.size(8.dp).background(orange1))
        Spacer(modifier = Modifier.width(10.dp))

        Box(modifier = Modifier.size(8.dp).background(orange1))

        Spacer(modifier = Modifier.width(200.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(orange1),
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)

        ) {
            Text(text = "Skip")
        }

    }

}


@Preview
@Composable

fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}