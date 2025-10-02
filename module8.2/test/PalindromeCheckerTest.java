import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    PalindromeChecker checker = new PalindromeChecker();
    @Test
    public void testIsPalindrome() {
        assertTrue(checker.isPalindrome("radar"));
    }
    @Test
    public void testIsPalindrome1() {
        assertTrue(checker.isPalindrome("Radar"));
    }
    @Test
    public void testIsPalindrome2() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }
    @Test
    public void testIsPalindrome3() {
        assertTrue(checker.isPalindrome("12321"));
    }
    @Test
    public void testIsPalindrome4() {
        assertTrue(checker.isPalindrome("123321"));
    }
    @Test
    public void testIsPalindrome5() {
        assertFalse(checker.isPalindrome("hello"));
    }
    @Test
    public void testIsPalindrome6() {
        assertFalse(checker.isPalindrome("phone"));
    }
    @Test
    public void testIsPalindrome7() {
        assertTrue(checker.isPalindrome("  o"));
    }
    @Test
    public void testIsPalindrome8() {
        assertTrue(checker.isPalindrome("     oo "));
    }
    @Test
    public void testIsPalindrome9() {
        assertTrue(checker.isPalindrome(",o ,, ,o,o, o, , , o, o ,o, , ,,,,,,,,,,,,,,,,,,,, o, o, o, o,o,o  ,oo o, o ,o, o ,     oo "));
    }
    @Test
    public void testIsPalindrome10() {
        assertTrue(checker.isPalindrome(" o"));
        assertTrue(checker.isPalindrome(",o"));
    }
    @Test
    public void testIsPalindrome11() {
        assertTrue(checker.isPalindrome("o "));
        assertTrue(checker.isPalindrome("o,"));
    }
}
