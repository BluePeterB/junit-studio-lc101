package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void EmptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsWithEscapeCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("\n[\t]"));
    }

    @Test
    public void onlyBracketsWithLongPriorTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("asdjklgoiwetnjc jefjv   vdnv n sacjjzxjnnxnzhcc  axhzhanx xdb bnkknsa  BJXSK  BHSawbs[]"));
    }

    @Test
    public void evenBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][][]"));
    }

    @Test
    public void oddBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][][][][]["));
    }
    @Test
    public void evenBracketsWithCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[asd][efg][qwer][a][as][we][wer]"));
    }

    @Test
    public void oddBracketsWithCharsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[asd][[efg][qwer][a][as][we][wer]"));
    }

    @Test
    public void EvenBracketsWithCharsInAndOutReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("kfjd[asd][efg][qwer][a]erty[as][we][wer"));
    }
    @Test
    public void oddBracketsWithCharsInAndOutReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[asd]fghj[[efg]uio[qwer]uio[a][as][we][wer]"));
    }

    @Test
    public void bracketsNotInFacingPairsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][asd][efg][qwer][a][as][we][wer"));
    }


}
