package id.kotlin.training.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

class CalculatorTest : Spek({

    given("Some calculator") {
        val calculator = Calculator()

        on("Addition") {
            val sum = calculator.sum(4, 4)

            it("Should return the addition between first and second number") {
                assertEquals(8, sum)
            }
        }

        on("Subtraction") {
            val subtract = calculator.subtract(10, 3)

            it("Should return the subtraction between first and second number") {
                assertEquals(7, subtract)
            }
        }

        on("Multiplying") {
            val multiple = calculator.multiple(3, 3)

            it("Should return the multiplying between first and second number") {
                assertEquals(9, multiple)
            }
        }

        on("Dividing") {
            val divide = calculator.divide(20, 2)

            it("Should return the dividing between first and second number") {
                assertEquals(10, divide)
            }
        }
    }
})