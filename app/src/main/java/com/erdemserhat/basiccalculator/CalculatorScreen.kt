package com.erdemserhat.basiccalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen() {
    var textForFirstInput by remember {
        mutableStateOf("")
    }

    var textForSecondInput by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Basic Calculator",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(15.dp)

        )
        
        InputElementSection(
            textForFirstInput =textForFirstInput,
            onValueChangedForFirstInput ={textForFirstInput=it} ,
            placeHolderTextForFirstInput ="Enter the first number" ,
            textForSecondInput = textForSecondInput,
            onValueChangedForSecondInput ={textForSecondInput=it} ,
            placeHolderTextForSecondInput = "Enter the second number",
        )
        if(!textForSecondInput.isEmpty() && !textForSecondInput.isBlank() &&
            !textForFirstInput.isBlank() && !textForFirstInput.isEmpty() &&
                !textForFirstInput.any{it in " -,." } &&
            !textForSecondInput.any{it in " -,." })

        {
            val a:Double = textForFirstInput.toDouble()
            val b:Double = textForSecondInput.toDouble()
            OperationSection(
                firstNumber = a,
                secondNumber = b
            )

        }



    }

}