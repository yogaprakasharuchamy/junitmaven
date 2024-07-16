package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTest {

    @Test
    public void divide() {
        calc c=new calc();
        int actual=c.divide(10,5);
        int expected=2;
        assertEquals(expected,actual);
    }
}