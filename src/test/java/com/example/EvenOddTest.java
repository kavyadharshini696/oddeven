
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", new EvenOdd().checkNumber(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", new EvenOdd().checkNumber(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", new EvenOdd().checkNumber(0));
    }
}