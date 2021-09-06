package com.rahul.codingchallenges;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @ArgumentsSource(BestTimeToBuyAndSellStockArgumentsProvider.class)
    void shouldCalculateBestTimeToBuyAndSellStock(int[] input, int expectedOutput) {
        int actualOutput = BestTimeToBuyAndSellStock.calculateBestTimeToBuyAndSellStock(input);
        assertEquals(expectedOutput, actualOutput, "The best time to buy and sell a stock should match the expected output");
    }

    private static class BestTimeToBuyAndSellStockArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            int[] input1 = {7, 1, 5, 3, 6, 4};
            int[] input2 = {7, 6, 4, 3, 2, 1};
            return Stream.of(Arguments.of(input1, 5), Arguments.of(input2, 0));
        }
    }
}
