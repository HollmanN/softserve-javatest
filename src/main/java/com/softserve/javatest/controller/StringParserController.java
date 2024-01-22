package com.softserve.javatest.controller;

import com.softserve.javatest.model.StringParserRecord;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringParserController {
    @PostMapping("/duplicates")
    public String removeDuplicates(@Validated @RequestBody StringParserRecord input){
        return "";
    }
}
