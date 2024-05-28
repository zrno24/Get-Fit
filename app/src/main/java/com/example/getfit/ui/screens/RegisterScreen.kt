package com.example.getfit.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getfit.R

@Composable
fun RegistrationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_dumbbell),
            contentDescription = "dumbbell icon",
            modifier = Modifier.size(width = 100.dp, height = 100.dp)
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        Text(
            fontSize = 20.sp,
            text = "Don't have an account yet?"
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        TextField(
            value = "",
            onValueChange = {},
            enabled = true,
            label = {
                Text(text = "email")
            },
            placeholder = {
                Text(text = "example@example.com")
            },
            isError = false
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        TextField(
            value = "",
            onValueChange = {},
            enabled = true,
            label = {
                Text(text = "password")
            },
            placeholder = {
                Text(text = "")
            },
            isError = false
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        TextField(
            value = "",
            onValueChange = {},
            enabled = true,
            label = {
                Text(text = "repeat password")
            },
            placeholder = {
                Text(text = "")
            },
            isError = false
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        Button(
            onClick = {},
            modifier = Modifier.size(width = 275.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text("Register", color = MaterialTheme.colorScheme.onPrimary)
        }

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        TextButton(
            onClick = {
            /*TODO*/
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Already have an account?")
        }
    }


}