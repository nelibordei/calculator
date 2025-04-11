package com.calculator.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testCalculate() {
        assertEquals(23, App.calculate("10 + 5 * 4 + 3"));
        assertEquals(7, App.calculate("3 + 2 * 2"));
        assertEquals(50, App.calculate("10 * 5"));
        assertEquals(1, App.calculate("5 - 4 + 2"));
    }
}
