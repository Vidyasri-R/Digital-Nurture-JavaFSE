import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {
    private StringUtils stringUtils;
    @Before
    public void setUp() {
        stringUtils = new StringUtils();
    }
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
    @Test
    public void testToUpperCaseNull() {
        assertNull(stringUtils.toUpperCase(null));
    }
    @Test
    public void testIsEmpty() {
        assertTrue(stringUtils.isEmpty(""));
        assertTrue(stringUtils.isEmpty(null));
        assertFalse(stringUtils.isEmpty("hello"));
    }
    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }
}
