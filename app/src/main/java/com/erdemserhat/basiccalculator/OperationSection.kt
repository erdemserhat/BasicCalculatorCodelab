package com.erdemserhat.basiccalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun OperationSection(
    firstNumber:Double,
    secondNumber:Double,
    modifier: Modifier=Modifier
){
    var result by rememberSaveable {
        mutableStateOf(0.0)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,


        modifier = modifier
            .fillMaxWidth()
    ) {
        Row {
            Button(onClick = { result = firstNumber + secondNumber }) {
                Text(text = "Sum")
            }

            Button(onClick = { result = firstNumber - secondNumber }) {
                Text(text = "Minus")
            }

            Button(onClick = { result = firstNumber * secondNumber }) {
                Text(text = "Multiply")
            }

            Button(onClick = { result = firstNumber / secondNumber }) {
                Text(text = "Divide")
            }


        }
        Text(
            text = "Result : $result",
            fontSize = 25.sp

        )
    }
}

@Preview
@Composable
fun OperationSectionPreview() {
    OperationSection(1.0,2.0)

}