package com.wcs.fizzbuzz.rules;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class WizzRuleTest {
    
    private final Rule rule = new WizzRule();

    @Test
    public void testBuzzRule() {
        for (int number : Arrays.asList(7, 14, 21, 49, 7001)) {
            StringBuilder sb = new StringBuilder();
            
            assertTrue("It must be applicable for " + number, rule.isApplicable(number));
            rule.apply(sb);
            
            assertEquals("It must be wizz for " + number, "wizz", sb.toString());
        }
    }
    
}
