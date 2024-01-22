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

    @Test
    public void whenStringHasNumbersAndDuplicates_thenRemoveDuplicates(){
        String input = "1A111B23C3334DE55";
        String expected = "1AB23C4DE5";
        String result = stringParserService.removeDuplicatesFromString(input);
        assert result.equals(expected);
    }

    @Test
    public void whenStringHasSpecialCharactersAndDuplicates_thenRemoveDuplicates(){
        String input = "1A1!!11B2%3C33&&34DE5\"5\"\"\"";
        String expected = "1A!B2%3C&4DE5\"";
        String result = stringParserService.removeDuplicatesFromString(input);
        assert result.equals(expected);
    }
}
