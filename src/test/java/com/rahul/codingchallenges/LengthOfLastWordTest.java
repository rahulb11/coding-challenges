package com.rahul.codingchallenges;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {

    @ParameterizedTest
    @ArgumentsSource(LengthOfLastWordTestArgumentsProvider.class)
    public void shouldReturnCorrectLengthOfLastWord(String input, int expected) {
        assertEquals(LengthOfLastWord.getLengthOfLastWord(input),
                expected,
                "The length of last word should match the expected value");
    }

    private static class LengthOfLastWordTestArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(Arguments.of("Hello World", 5),
                    Arguments.of(" ", 0));
        }
    }

}
