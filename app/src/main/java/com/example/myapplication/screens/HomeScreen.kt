package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.AppViewModel
import com.example.myapplication.ui.theme.MyApplicationTheme
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun HomeScreen(navController: NavController, appViewModel: AppViewModel) {
    Text(
        text = "Hello !",
    )
    Button(onClick = { appViewModel.fetchUgandanUniversities() }) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Column {
        Text(text = "All Universities")
        Column {
            Text(text = "Busitema")

        }
    }
}