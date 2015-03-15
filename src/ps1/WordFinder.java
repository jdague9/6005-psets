package ps1;


import java.util.HashMap;
import java.util.Map;

public class WordFinder {
    /**
     * Given a String (the haystack) and an array of Strings (the needles),
     * return a Map<String, Integer>, where keys in the map correspond to
     * elements of needles that were found as substrings of haystack, and the
     * value for each key is the lowest index of haystack at which that needle
     * was found. A needle that was not found in the haystack should not be
     * returned in the output map.
     * 
     * @param haystack The string to search into.
     * @param needles The array of strings to search for. This array is not
     *                mutated.
     * @return The list of needles that were found in the haystack.
     */
    public static Map<String, Integer> getSubstrings(String haystack,
                                                     String[] needles) { 
        Map<String, Integer> output = new HashMap<String, Integer>();
        char[] hs = haystack.toCharArray();
        char[] test;
        int k;
        int l;
        for (int i = 0; i < needles.length; i++) {
            test = needles[i].toCharArray();
            outerLoop:
            for (int j = 0; j < hs.length - (test.length - 1); j++) {
                k = 0;
                l = j;
                while (k < test.length) {
                    if (test[k] != hs[l]) { continue outerLoop; }
                    k++;
                    l++;
                }
                output.put(needles[i], j);
                break;
            }
        }
        return output;
    }
}
