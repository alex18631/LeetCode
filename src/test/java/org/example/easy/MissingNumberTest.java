package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @ParameterizedTest
    @MethodSource("input")
    void missingNumberTest(int[] nums, int result) {
        assertEquals(result, MissingNumber.missingNumber(nums));
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1}, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8));
    }
}