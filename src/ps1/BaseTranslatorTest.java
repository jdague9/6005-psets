package ps1;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BaseTranslatorTest {
    @Test
    public void basicBaseTranslatorTest() {
        // Expect that .01 in base-2 is .25 in base-10
        // (0 * 1/2^1 + 1 * 1/2^2 = .25)
        int[] input = {0, 1};
        int[] expectedOutput = {2, 5};
        System.out.println(Arrays.toString(BaseTranslator.convertBase(input, 2, 10, 2)));
        assertArrayEquals(expectedOutput,
                          BaseTranslator.convertBase(input, 2, 10, 2));
        input = new int[]{2,0,1};
        expectedOutput = new int[]{4,1,0};
        assertArrayEquals(expectedOutput,
                          BaseTranslator.convertBase(input, 4, 8, 3));
        input = new int[]{1};
        expectedOutput = new int[] {0,0,0,1,1,0};
        assertArrayEquals(expectedOutput,
                          BaseTranslator.convertBase(input, 10, 2, 6));
    }
    @Test
    public void emptyBaseTranslatorTest() {
        int[] input = new int[0];
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 2, 10, 2));
    }
    @Test
    public void badPrecisionBaseTranslatorTest() {
        int[] input = {0, 1};
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 2, 10, 0));
    }
    @Test
    public void badBaseBaseATranslatorTest() {
        int[] input = {5, 9, 17};
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 12, 20, 3));
        input = new int[]{0,0,0};
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 1, 4, 3));
    }
    @Test
    public void badBaseBaseBTranslatorTest() {
        int[] input = {5, 9, 8};
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 12, 1, 3));
    }
    @Test
    public void negInputBaseTranslatorTest() {
        int[] input = {2, -9, 4};
        assertArrayEquals(null,
                          BaseTranslator.convertBase(input, 10, 12, 3));
    }
    // TODO: Write more tests (Problem 2.a)
}
