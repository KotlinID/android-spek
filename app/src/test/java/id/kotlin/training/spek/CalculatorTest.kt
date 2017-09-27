package id.kotlin.training.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class CalculatorTest : Spek({

    given("Some calculator") {
        val calculator = Calculator()

        on("Addition") {
            val sum = calculator.sum(4, 4)

            it("Should return the addition between first and second number") {
                assertEquals(8, sum)
            }
        }
    }
})