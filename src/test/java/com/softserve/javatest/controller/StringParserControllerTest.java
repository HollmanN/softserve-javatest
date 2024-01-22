package com.softserve.javatest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.softserve.javatest.model.StringParserRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class StringParserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenInputStringHasDuplicates_thenRemoveDuplicates() throws Exception {
        StringParserRecord input = new StringParserRecord("AAAABBBBCCCCDDDDE");
        String expectedResult = "ABCDE";
        mockMvc.perform(post("/duplicates").contentType("application/json")
                        .content(new ObjectMapper().writeValueAsString(input))).andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedResult)));
    }
}