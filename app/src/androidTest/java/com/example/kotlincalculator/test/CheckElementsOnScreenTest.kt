package com.example.kotlincalculator.test

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import com.example.kotlincalculator.MainActivity
import com.example.kotlincalculator.screen.CalculatorScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Test

class CheckElementsOnScreenTest : TestCase() {


    @Test
    fun checkElements() {
        before {

            val activityScenario: ActivityScenario<MainActivity> =
                ActivityScenario.launch(MainActivity::class.java)

            activityScenario.moveToState(Lifecycle.State.RESUMED)

        }.after {

        }.run {

            step("Поле Результат отображается на экране") {
                CalculatorScreen.resultsTV {
                    isVisible()
                }
            }

            step("Поле Ввода отображается на экране") {
                CalculatorScreen.workingsTV {
                    isVisible()
                }
            }

            step("Поле Ввода отображается на экране") {
                CalculatorScreen.workingsTV {
                    isVisible()
                }
            }

            step("Кнопка AC отображается на экране и содержит текст AC") {
                CalculatorScreen.clearAC {
                    isVisible()
                    hasText("AC")
                }
            }


        }

    }

}