package com.akshayashokcode.notepad.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.akshayashokcode.notepad.R

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )


)
val customTypography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily( Font(R.font.varela_round_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
