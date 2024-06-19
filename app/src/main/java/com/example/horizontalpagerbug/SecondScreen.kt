package com.example.horizontalpagerbug

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen() {

    Box(
        modifier = Modifier
            .padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 40.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Icon(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.ic_document),
                tint = Color.Yellow,
                contentDescription = "doc icon"
            )

            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "this is a title",
                fontSize = TextUnit(23f, TextUnitType.Sp),
                color = Color.Black
            )

            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                lineHeight = TextUnit(25.6f, TextUnitType.Sp),
                text = "This is a Text",
                color = Color.Black,
            )

        }
    }
}