/********************StudentID:B201202061**************
 ********************Name:Mihrinur*********************
 ********************Surname:İlunt*********************
 ********************Course Name:SWE202 SOFTWARE VERIFICATION AND VALIDATION
 ********************Assignment1***********************
 ********************GitHub Repository address: https://github.com/mihrinurilunt/Assignment1.git */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5","12.5, 5, 2.5","10, 2.5, 4","12.5, 2.5, 5",})
     void dataDrivenDivide(double dividend, double divisor, double expectedValue) {

        assertEquals(expectedValue, Calculator.divide(dividend, divisor),
                "The result of Calculator.divide method is incorrect.");
    }

    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );
    }
}