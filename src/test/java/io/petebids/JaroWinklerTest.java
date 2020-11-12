package io.petebids;

import org.junit.Test;

import static org.junit.Assert.*;

public class JaroWinklerTest {

    @Test
    public void evaluate() {
        JaroWinkler jw = new JaroWinkler();
        Double actual = jw.evaluate("string", "string");
        Double expected = 1.0;
        assertEquals(expected, actual);
    }

    @Test
    public void evaluate2(){
        JaroWinkler jw = new JaroWinkler();
        Double actual = jw.evaluate("string", "foopedies");
        Double expected = 0.4259259259259259;
        assertEquals(expected, actual);
    }
}