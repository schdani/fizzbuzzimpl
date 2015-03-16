package com.wcs.fizzbuzz.rules;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class FizzRuleTest {

    private final FizzRule rule = new FizzRule();

    @Test
    public void testFizzRule() {
        for (int number : Arrays.asList(3, 6, 13, 103)) {
            StringBuilder sb = new StringBuilder();
            
            assertTrue("It must be applicable for " + number, rule.isApplicable(number));
            rule.apply(sb);
            
            assertEquals("It must be fizz for " + number, "fizz", sb.toString());
        }
    }

}
