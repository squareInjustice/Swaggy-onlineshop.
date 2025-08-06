package com.angela.swaggy.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.angela.swaggy.R
import com.angela.swaggy.navigation.ROUT_HOME
import com.angela.swaggy.navigation.ROUT_LOGIN
import com.angela.swaggy.ui.theme.orange1
import com.angela.swaggy.ui.theme.orange2
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    val coroutine =rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)
    }

    Column(

        modifier = Modifier.fillMaxSize().background(orange2),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.shopping_girl))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        //End of animation


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop smart. Live better",
            fontSize = 18.sp,
            color = orange1
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Thousands of products at your fingertips. Great deals, fast delivery",
            fontSize = 18.sp,
            color = orange1,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        CircularProgressIndicator(
            color = orange1
        )

    }

}

@Preview(showBackground = true)
@Composable

fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}