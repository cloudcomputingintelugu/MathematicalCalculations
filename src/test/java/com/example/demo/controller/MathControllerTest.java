package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MathControllerTest {

    MathController controller = new MathController();

    @Test
    void testWithParams() {
        // Read params from mvn command line
        int a = Integer.parseInt(System.getProperty("a", "0"));
        int b = Integer.parseInt(System.getProperty("b", "0"));

        // Addition
        String addResponse = controller.add(a, b);
        int expectedAdd = a + b;
        System.out.println("Expected Addition: Addition Result: " + expectedAdd);
        System.out.println("Controller Response: " + addResponse);
        assertThat(addResponse).isEqualTo("Addition Result: " + expectedAdd);

        // Subtraction
        String subResponse = controller.subtract(a, b);
        int expectedSub = a - b;
        System.out.println("Expected Subtraction: Subtraction Result: " + expectedSub);
        System.out.println("Controller Response: " + subResponse);
        assertThat(subResponse).isEqualTo("Subtraction Result: " + expectedSub);

        // Multiplication
        String mulResponse = controller.multiply(a, b);
        int expectedMul = a * b;
        System.out.println("Expected Multiplication: Multiplication Result: " + expectedMul);
        System.out.println("Controller Response: " + mulResponse);
        assertThat(mulResponse).isEqualTo("Multiplication Result: " + expectedMul);
    }
}
