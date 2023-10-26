package com.example.androidwithgolib.View

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidwithgolib.ui.theme.AndroidWithGoLibTheme

import simple.Simple

@Composable
fun Home(){
    var value by remember{ mutableStateOf(0) }
    
    Column {
        Text(text = "Value: ${value}")

        Button(onClick = {
            value = Simple.addOne(value)
        }) {
            Text("Call AddOne")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    AndroidWithGoLibTheme {
        Home()
    }
}
