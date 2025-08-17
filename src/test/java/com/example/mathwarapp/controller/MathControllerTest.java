package com.example.mathwarapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddition() throws Exception {
        mockMvc.perform(get("/math/add?a=5&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("Result: 8"));
    }

    @Test
    void testSubtraction() throws Exception {
        mockMvc.perform(get("/math/subtract?a=10&b=4"))
                .andExpect(status().isOk())
                .andExpect(content().string("Result: 6"));
    }

    @Test
    void testMultiplication() throws Exception {
        mockMvc.perform(get("/math/multiply?a=7&b=6"))
                .andExpect(status().isOk())
                .andExpect(content().string("Result: 42"));
    }

    @Test
    void testDivision() throws Exception {
        mockMvc.perform(get("/math/divide?a=20&b=4"))
                .andExpect(status().isOk())
                .andExpect(content().string("Result: 5"));
    }

    @Test
    void testDivisionByZero() throws Exception {
        mockMvc.perform(get("/math/divide?a=20&b=0"))
                .andExpect(status().isOk())
                .andExpect(content().string("Error: Cannot divide by zero"));
    }
}

