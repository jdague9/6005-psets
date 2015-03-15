package ps1;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordFinderTest {
    @Test
    public void basicGetSubstringsTest() {
        String haystack = "abcde";
        String[] needles = {"ab", "abc", "de", "fg"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();
        expectedOutput.put("ab", 0);
        expectedOutput.put("abc", 0);
        expectedOutput.put("de", 3);

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack, needles));
    }
    @Test
    public void noneFoundGetSubstringsTest() {
        String haystack = "abcde";
        String[] needles = {"xy", "hvw", "qq", "r"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack, needles));
    }
    @Test
    public void emptyHaystackGetSubstringsTest() {
        String haystack = "";
        String[] needles = {"ab", "abc", "de", "fg"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack, needles));
    }
    @Test
    public void emptyNeedlesSubstringsTest() {
        String haystack = "abcde";
        String[] needles = new String[0];

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack, needles));
    }
    @Test
    public void edgeCasesGetSubstringsTest() {
        String haystack = "abcde";
        String[] needles = {"abcde", "a", "b", "c", "d", "e", "t"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();
        expectedOutput.put("abcde", 0);
        expectedOutput.put("a", 0);
        expectedOutput.put("b", 1);
        expectedOutput.put("c", 2);
        expectedOutput.put("d", 3);
        expectedOutput.put("e", 4);

        assertEquals(expectedOutput, WordFinder.getSubstrings(haystack, needles));
    }
    // TODO: Write more tests (Problem 4.a)
}
