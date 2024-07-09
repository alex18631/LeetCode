package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottlesTest {

    @ParameterizedTest
    @CsvSource(value = {
            "9,3,13",
            "15,4,19",
            "23,4,30",
            "1,2,1",
            "100,100,101"})
    public void waterBottles(int numBottles, int numExchange, int expected) {
        assertEquals(expected, WaterBottles.waterBottles(numBottles, numExchange));
    }
}