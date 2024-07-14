package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfTwoTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1, true",
            "16, true",
            "3, false",
            "5, false",
            "6, false",
            "0, false",
            "-2147483648, false"
    })
    void isPowerOfTwoTest(int n, boolean result) {
        assertEquals(result, PowerOfTwo.isPowerOfTwo(n));
    }
}