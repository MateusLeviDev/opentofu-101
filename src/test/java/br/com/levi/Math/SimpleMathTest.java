package br.com.levi.Math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in simpleMath class")
class SimpleMathTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]

    @Test
    @DisplayName("Test 8 + 2 = 10")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        //AAA -> arrange, act, assert

        //Given
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(8D, 2D);
        Double expected = 10D;
        //When
        assertEquals(expected, actual, () -> "Error");
        //Then
        assertNotEquals(11D, actual);
        assertNotNull(actual);

    }

    @Test
    @DisplayName("Test 10 - 5 = 5")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 5D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 5D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    @Test
    @DisplayName("Test 10 * 5 = 50")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 5D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 50D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    @Test
    @DisplayName("Test squareRoot of 100 = 10")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        Double number = 100D;
        Double actual = math.squareRoot(number);
        Double expected = 10D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            SimpleMath math = new SimpleMath();
            math.division(10.0, 0.0);
        });
    }
}