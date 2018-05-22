package com.example.devskiller;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class MapDecoderTestSuite {
    private MapDecoder mapDecoder;

    @Before
    public void testSetup() throws Exception {
        mapDecoder = new MapDecoder();
    }

    @Test
    public void decodeMap1() throws Exception {
        //given
        final String input = "one=1&two=2";

        //when
        Map<String, String> result = mapDecoder.decode(input);

        //then
        Map<String, String> expected = new HashMap<>();
        expected.put("one", "1");
        expected.put("two", "2");

        assertEquals(expected, result);
    }

    @Test
    public void decodeMap2() throws Exception {
        //given
        final String input = "one=1&two=2&=3&four=";

        //when
        Map<String, String> result = mapDecoder.decode(input);

        //then
        Map<String, String> expected = new HashMap<>();
        expected.put("one", "1");
        expected.put("two", "2");
        expected.put("", "3");
        expected.put("four", "");

        assertEquals(expected, result);
    }

    @Test
    public void decodeMap3() throws Exception {
        //given
        final String input = "=1&two=2&=3&four=4";

        //when
        Map<String, String> result = mapDecoder.decode(input);

        //then
        Map<String, String> expected = new HashMap<>();
        expected.put("", "1");
        expected.put("two", "2");
        expected.put("", "3");
        expected.put("four", "4");

        assertEquals(expected, result);
    }

    @Test
    public void decodeMap4() throws Exception {
        //given
        final String input = "=1&two=2&=3&four=";

        //when
        Map<String, String> result = mapDecoder.decode(input);

        //then
        Map<String, String> expected = new HashMap<>();
        expected.put("", "1");
        expected.put("two", "2");
        expected.put("", "3");
        expected.put("four", "");

        assertEquals(expected, result);
    }
}