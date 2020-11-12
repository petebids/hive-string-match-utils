package io.petebids;

import org.junit.Test;

import static org.junit.Assert.*;

public class JaroWinklerTest {

    @Test
    public void evaluate() {
        JaroWinkler jw = new JaroWinkler();
        Integer actual = jw.evaluate("string", "string");
        Integer expected = 1;
        assertEquals(expected, actual);
    }
}