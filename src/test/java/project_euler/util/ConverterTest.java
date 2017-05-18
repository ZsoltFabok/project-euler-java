package project_euler.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private Converter converter;

    @Before
    public void setup() {
        converter = new Converter();
    }

    @Test
    public void returnsThree() {
        assertEquals("three", converter.toLetters(3));
    }

    @Test
    public void returnsSevenTeen() {
        assertEquals("seventeen", converter.toLetters(17));
    }

    @Test
    public void returnsThirty() {
        assertEquals("thirty", converter.toLetters(30));
    }

    @Test
    public void returnsThirtySeven() {
        assertEquals("thirty-seven", converter.toLetters(37));
    }

    @Test
    public void returnsOneHundred() {
        assertEquals("one hundred", converter.toLetters(100));
    }

    @Test
    public void returnsFourHundred() {
        assertEquals("four hundred", converter.toLetters(400));
    }

    @Test
    public void returnsFourHundredAndThirtySeven() {
        assertEquals("four hundred and thirty-seven", converter.toLetters(437));
    }

    @Test
    public void returnsOneThousand() {
        assertEquals("one thousand", converter.toLetters(1000));
    }
}
