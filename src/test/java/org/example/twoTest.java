package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class twoTest {

    @Test
    public void add() {
        two t=new two();
        int check= t.add(2,4);
        int ex=6;
        assertEquals(ex,check);
    }

    @Test
    public void sub() {
        two t1=new two();
        int ch=t1.sub(4,2);
        int exp=1;
        assertEquals(ch,exp);
    }
}