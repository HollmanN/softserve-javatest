package com.softserve.javatest.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class StringParserServiceTest {
    @InjectMocks
    StringParserService stringParserService;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenStringHasDuplicates_thenRemoveDuplicates(){
        String input = "AAAABBBBBCCCCCDEEEE";
        String expected = "ABCDE";
        String result = stringParserService.removeDuplicatesFromString(input);
        assert result.equals(expected);
    }

    @Test
    public void whenStringDoesntHasDuplicates_thenReturnSameString(){
        String input = "ABCDE";
        String expected = "ABCDE";
        String result = stringParserService.removeDuplicatesFromString(input);
        assert result.equals(expected);
    }
}
