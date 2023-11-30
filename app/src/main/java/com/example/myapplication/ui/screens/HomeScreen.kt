package com.example.myapplication.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.AppViewModel
import com.example.myapplication.ui.components.ListTile

@Composable
fun HomeScreen(navController: NavController, appViewModel: AppViewModel) {
    val universities by appViewModel.universities.collectAsState()
    Surface(modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)) {
        Column {


            Text(text = "All Universities", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(30.dp))

            if(universities.size==0){
                CircularProgressIndicator()
            }else{
                LazyColumn(){
                    items(universities){
                            university ->  ListTile(icon = Icons.Rounded.AccountBox, label = "${university.name}") {
                    }
                        Spacer(modifier = Modifier.height(13.dp))
                    }

                }            }


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Surface(modifier = Modifier.padding(horizontal = 15.dp, vertical = 10.dp)) {
        Column {


            Text(text = "All Universities", fontSize = 30.sp)
Spacer(modifier = Modifier.height(30.dp))
                ListTile(icon = Icons.Rounded.AccountBox, label = "University") {

            }

        }
    }

}