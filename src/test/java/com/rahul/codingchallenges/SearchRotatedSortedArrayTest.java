package com.rahul.codingchallenges;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRotatedSortedArrayTest {

    @ParameterizedTest
    @ArgumentsSource(SearchRotatedSortedArrayArgumentsProvider.class)
    void shouldSearchAsExpectedInRotatedSortedArray(int[] inputArray, int inputTarget, int expectedIndex) {
        int actualIndex = SearchInRotatedSortedArray.searchInRotatedSortedArray(inputArray, inputTarget);
        assertEquals(expectedIndex, actualIndex, "The searched target's index should match the expected index");
    }

    private static class SearchRotatedSortedArrayArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {

            return Stream.of(Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4),
                    Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1),
                    Arguments.of(new int[]{1}, 0, -1),
                    Arguments.of(new int[]{1}, 2, -1),
                    Arguments.of(new int[]{1, 3, 5}, 5, 2),
                    Arguments.of(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8, 4));
        }
    }
}
