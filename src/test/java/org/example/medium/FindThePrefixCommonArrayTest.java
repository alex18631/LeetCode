package org.example.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindThePrefixCommonArrayTest {

    @ParameterizedTest
    @MethodSource("input")
    void findThePrefixCommonArray(int[] masA, int[] masB, int[] result) {
        assertEquals(0, Arrays.compare(result, FindThePrefixCommonArray.findThePrefixCommonArray(masA, masB)));
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4}, new int[]{0, 2, 3, 4}),
                Arguments.of(new int[]{2, 3, 1}, new int[]{3, 1, 2}, new int[]{0, 1, 3}));
    }
}