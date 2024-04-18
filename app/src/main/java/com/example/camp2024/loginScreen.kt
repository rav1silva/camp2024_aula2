package com.example.camp2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camp2024.ui.theme.pinkIoasys

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = pinkIoasys),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Text(text = "Seja bem Vindo!", color = Color.White, fontSize = 30.sp)
        Text(modifier = Modifier.padding(top = 16.dp), color = Color.White, fontSize = 24.sp, text = "lista de tarefas")

        TextField(
            modifier = Modifier.fillMaxWidth().padding(top = 48.dp, bottom = 16.dp, end = 16.dp, start = 16.dp),
            value = email,
            onValueChange = { value -> email = value }
            ,label = { Text (text = "usuario")
            })
        TextField(modifier = Modifier.fillMaxWidth().padding(end = 16.dp, start = 16.dp), value = password, onValueChange = { password = it }
            ,label = { Text (text = "senha")
            })

        Button(onClick = { }) {
            Text (text = "           ENTRAR          " , fontSize = 16.sp)

        }


    }
}

@Preview
@Composable
fun loginScreenPreview() {
    LoginScreen()
}

