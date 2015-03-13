package ps1;


import static org.junit.Assert.*;

import org.junit.Test;

public class PiGeneratorTest {
    @Test
    public void basicPowerModTest() {
        // 5^7 mod 23 = 17
        assertEquals(17, PiGenerator.powerMod(5, 7, 23));
    }
    @Test
    public void oneNegativeToPowerModTest() {
        assertEquals(-1, PiGenerator.powerMod(5, 7, -3));
        assertEquals(-1, PiGenerator.powerMod(5, -3, 4));
        assertEquals(-1, PiGenerator.powerMod(-3, 7, 4));
    }
    @Test
    public void twoNegativeToPowerModTest() {
        assertEquals(-1, PiGenerator.powerMod(5, -2, -3));
        assertEquals(-1, PiGenerator.powerMod(-2, 7, -3));
        assertEquals(-1, PiGenerator.powerMod(-2, -3, 4));
    }
    @Test
    public void threeNegativeToPowerModTest() {
        assertEquals(-1, PiGenerator.powerMod(-5, -7, -3));
    }
    @Test
    public void zeroModToPowerModTest() {
        assertEquals(0, PiGenerator.powerMod(5, 7, 0));
        assertEquals(1, PiGenerator.powerMod(5, 0, 2));
        assertEquals(0, PiGenerator.powerMod(0, 7, 2));
    }
    @Test
    public void computePiInHexTest() {
        assertEquals(null, PiGenerator.computePiInHex(-5));
        int[] arr = new int[0];
        int[] test = PiGenerator.computePiInHex(0);
        for (int i = 0; i < test.length; i++) {
            assertEquals(arr[i], test[i]);
        }
        arr = new int[]{2};
        test = PiGenerator.computePiInHex(1);
        for (int i = 0; i < test.length; i++) {
            assertEquals(arr[i], test[i]);
        }
        arr = new int[]{2,4,3,15,6,10,8,8};
        test = PiGenerator.computePiInHex(8);
        for (int i = 0; i < test.length; i++) {
            assertEquals(arr[i], test[i]);
        }
    }
    
    // TODO: Write more tests (Problem 1.a, 1.c)
}
