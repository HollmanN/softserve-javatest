package com.softserve.javatest.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StringParserService {
    // This method removes duplicate characters from the input string
    public String removeDuplicatesFromString(String parseString) {
        // Use a LinkedHashSet to maintain the order of characters while removing duplicates
        Set<Character> characters = new LinkedHashSet<>();

        // Iterate through each character in the input string
        for (int i = 0; i < parseString.length(); i++) {
            // Add each character to the set (automatically removes duplicates)
            characters.add(parseString.charAt(i));
        }

        // Convert the set of characters to a string by joining them
        return characters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
