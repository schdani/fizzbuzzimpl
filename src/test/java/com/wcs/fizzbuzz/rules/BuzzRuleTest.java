package com.wcs.fizzbuzz.rules;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class BuzzRuleTest {
    
    private final Rule rule = new BuzzRule();

    @Test
    public void testBuzzRule() {
        for (int number : Arrays.asList(5, 10, 52, 50002)) {
            StringBuilder sb = new StringBuilder();
            
            assertTrue("It must be applicable for " + number, rule.isApplicable(number));
            rule.apply(sb);
            
            assertEquals("It must be buzz for " + number, "buzz", sb.toString());
        }
    }
    
}
