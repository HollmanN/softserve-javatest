package com.softserve.javatest.controller;

import com.softserve.javatest.model.StringParserRecord;
import com.softserve.javatest.service.StringParserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringParserController {
    private final StringParserService stringParserService;

    public StringParserController(StringParserService stringParserService){
        this.stringParserService = stringParserService;
    }

    @PostMapping("/duplicates")
    public String removeDuplicates(@Validated @RequestBody StringParserRecord input){
        return stringParserService.removeDuplicatesFromString(input.input());
    }
}
