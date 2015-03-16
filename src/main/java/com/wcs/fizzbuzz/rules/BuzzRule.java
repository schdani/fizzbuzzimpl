package com.wcs.fizzbuzz.rules;

/**
 *
 * @author thomas
 */
public class BuzzRule implements Rule {

    @Override
    public boolean isApplicable(int number) {
        final String stringNumber = String.valueOf(number);
        
        return number % 5 == 0 || stringNumber.contains("5");
    }

    @Override
    public void apply(StringBuilder value) {
        value.append("buzz");
    }
    
}
