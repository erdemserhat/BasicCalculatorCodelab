package com.erdemserhat.basiccalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InputElementSection(
    textForFirstInput:String,
    onValueChangedForFirstInput:(String)->Unit,
    placeHolderTextForFirstInput:String,

    textForSecondInput:String,
    onValueChangedForSecondInput:(String)->Unit,
    placeHolderTextForSecondInput:String,
    modifier: Modifier=Modifier

) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
    ) {
        InputElement(
            text = textForFirstInput,
            onValueChanged = onValueChangedForFirstInput,
            placeHolderText = placeHolderTextForFirstInput
        )

        InputElement(
            text = textForSecondInput,
            onValueChanged = onValueChangedForSecondInput,
            placeHolderText = placeHolderTextForSecondInput
        )
    }
    
    
}

@Preview
@Composable
fun InputElementSectionPreview() {
    InputElementSection(
        textForFirstInput = "",
        onValueChangedForFirstInput = {},
        placeHolderTextForFirstInput = "Enter the first number",

        textForSecondInput = "",
        onValueChangedForSecondInput = {},
        placeHolderTextForSecondInput = "Enter the second number"



    )

    
}