package com.example.capyconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.capyconnect.ui.theme.CapyconnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapyconnectTheme{

                Surface (
                    //Background Color
                    color = Color.Black
                ){
                    Column(
                        //Create Overall Columns That Will Hold All Widgets
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        //Top Banner
                        Surface (
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp)),
                            color = Color(0xFF0CBBF5)

                        ){
                            //Banner Text
                            Text(
                                text = "CapyConnect",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 60.sp,
                                    fontWeight = FontWeight.Bold,
                                ),
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(vertical = 20.dp)
                            )
                        }
                        //Spacing Between Banner
                        Spacer(
                            modifier = Modifier
                                .height(40.dp)
                        )
                        //Text Boxes
                        SignInInfo(inStuff = "Select University", input = "university name")
                        SignInInfo(inStuff = "School Email", input = "capy@harvard.edu")
                        SignInInfo(inStuff = "Username", input = "oldmcbob")
                        SignInInfo(inStuff = "Password", input = "**********")
                        //Spacer After Text Boxes
                        Spacer(
                            modifier = Modifier
                                .height(40.dp)
                        )
                        NavigationButton()
                    }
                }
            }
        }
    }
    @Composable
    fun SignInInfo (inStuff: String, input: String) {
        Text(
            text = inStuff,
            color = Color.White,
            fontSize = 40.sp
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Surface (
            color = Color.DarkGray,
            modifier = Modifier
                .width(300.dp)
                .padding(vertical = 5.dp)
                .clip(RoundedCornerShape(50.dp))
        ) {
            Text(
                text = input,
                color = Color.Gray,
                fontSize = 30.sp,
                //textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Center
            )

        }
    }
    @Composable
    fun NavigationButton() {
        OutlinedButton(
            onClick = {

            },
            modifier = Modifier

                //.background(Color(0xFFF5F10C))// Change the color here
                //.clip(RoundedCornerShape(30.dp))

        ) {
            Text(
                text = "Sign Up",
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(150.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            )
        }
    }
}

