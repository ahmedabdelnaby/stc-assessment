package com.stc.assessment.solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseParenthesesTest {

    @Test
    public void testBasic() {
        assertEquals("dcba", ReverseParentheses.reverseParentheses("(abcd)"));
        assertEquals("adcb", ReverseParentheses.reverseParentheses("a(bcd)"));
        assertEquals("(abcd", ReverseParentheses.reverseParentheses("(abcd"));
        assertEquals("dbca", ReverseParentheses.reverseParentheses("(a(bc)d)"));
        assertEquals("pmnolkjidfeghcbaq", ReverseParentheses.reverseParentheses("(abc(d(ef)gh)ijkl(mno)p)q"));
        assertEquals("", ReverseParentheses.reverseParentheses(""));
        assertEquals("abc", ReverseParentheses.reverseParentheses("abc"));
    }

    @Test
    public void testMaxInputSize() {
        // Test the maximum input size constraint
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append("a");
        }
        String input = sb.toString();
        assertEquals(input, ReverseParentheses.reverseParentheses(input));
    }
}
