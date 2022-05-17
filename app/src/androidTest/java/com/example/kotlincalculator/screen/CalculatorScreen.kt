package com.example.kotlincalculator.screen

import com.example.kotlincalculator.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView


object CalculatorScreen : KScreen<CalculatorScreen>() {
    override val layoutId: Int?
        get() = TODO("Not yet implemented")
    override val viewClass: Class<*>?
        get() = TODO("Not yet implemented")

    val resultsTV = KTextView { withId(R.id.resultsTV) }
    val workingsTV = KTextView { withId(R.id.workingsTV) }
    val clearAC = KButton { withId(R.id.clearAC) }

}