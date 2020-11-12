package io.petebids;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistanceTest {

    @Test
    public void evaluate() {
        EditDistance ed = new EditDistance();
        Integer expected = 0;
        Integer actual = ed.evaluate("string", "string");
        assertEquals(expected, actual);
    }
    @Test
    public void evaluate2(){
        EditDistance ed = new EditDistance();
        Integer expected = 1;
        Integer actual = ed.evaluate("string", "strang");
        assertEquals(expected, actual);
    }

    @Test
    public void evaluate3(){
        EditDistance ed = new EditDistance();
        Integer expected = 6;
        Integer actual = ed.evaluate("string", "boop");
        assertEquals(expected, actual);
    }
}