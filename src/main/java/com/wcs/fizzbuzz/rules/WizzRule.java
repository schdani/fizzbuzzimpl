package com.wcs.fizzbuzz.rules;

/**
 *
 * @author thomas
 */
public class WizzRule implements Rule {

    @Override
    public boolean isApplicable(int number) {
        final String stringNumber = String.valueOf(number);
        
        return number % 7 == 0 || stringNumber.contains("7");
    }

    @Override
    public void apply(StringBuilder value) {
        value.append("wizz");
    }
    
}
