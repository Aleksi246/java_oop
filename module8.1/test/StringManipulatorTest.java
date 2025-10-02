import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    @Test
    void canConcatenate() {
        assertEquals("hellohello", StringManipulator.concatenate("hello", "hello"));
    }

    @Test
    void canFindLength() {
        assertEquals(10, StringManipulator.findLength("hellohello"));
    }

    @Test
    void canConvertToUpperCase() {
        assertEquals("HELLO", StringManipulator.convertToUpperCase("hEllo"));
        assertEquals("123!", StringManipulator.convertToUpperCase("123!"));
    }

    @Test
    void canConvertToLowerCase() {
        assertEquals("hello", StringManipulator.convertToLowerCase("HeLLO"));
        assertEquals("java123", StringManipulator.convertToLowerCase("Java123"));
    }

    @Test
    void canSearchSubString() {
        assertTrue(StringManipulator.containsSubstring("hello world", "world"));
        assertFalse(StringManipulator.containsSubstring("hello world", "java"));
        assertTrue(StringManipulator.containsSubstring("abcabc", "a"));
    }


}
