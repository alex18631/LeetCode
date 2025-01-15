package org.example.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimizeXorTest {

    @ParameterizedTest
    @MethodSource("input")
    void minimizeXor(int a, int b, int expected) {
        assertEquals(MinimizeXor.minimizeXor(a, b), expected);
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(3, 5, 3),
                Arguments.of(1, 12, 3),
                Arguments.of(7, 12, 6),
                Arguments.of(13, 12, 12),
                Arguments.of(28, 12, 24),
                Arguments.of(79, 74, 76),
                Arguments.of(91, 18, 80),
                Arguments.of(43, 68, 40),
                Arguments.of(8, 75, 15));
    }
}