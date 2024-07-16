package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class multiTest {

    @Test
    public void multi() {
        multi m=new multi();
        int ac=m.multi(3,4);
        int ex=12;
        assertEquals(ex,ac);
    }
}