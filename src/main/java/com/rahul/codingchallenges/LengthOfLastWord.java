package com.rahul.codingchallenges;

final class LengthOfLastWord {

    static int getLengthOfLastWord(String input) {
        String[] words = input.split(" ");
        return words.length > 0 ? words[words.length - 1].length() : 0;
    }
}