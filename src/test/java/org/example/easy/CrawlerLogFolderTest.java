package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrawlerLogFolderTest {

    @ParameterizedTest
    @MethodSource("input")
    void crawlerLogFolderTest(String[] logs, int result) {
        assertEquals(result, CrawlerLogFolder.minOperations(logs));
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new String[]{"d1/", "d2/", "../", "d21/", "./"}, 2),
                Arguments.of(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}, 3),
                Arguments.of(new String[]{"d1/", "../", "../", "../"}, 0));
    }
}