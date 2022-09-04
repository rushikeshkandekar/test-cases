package com.crossasyst.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
@Test
    void shouldReturnAddition(){
    Calculator calculator = new Calculator();
    assertEquals(4,calculator.add(2,2));
}

}