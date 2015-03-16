package com.wcs.fizzbuzz.rules;

/**
 *
 * @author thomas
 */
public class FizzRule implements Rule {

    @Override
    public boolean isApplicable(int number) {
        final String stringNumber = String.valueOf(number);
        
        return number % 3 == 0 || stringNumber.contains("3");
    }

    @Override
    public void apply(StringBuilder value) {
        value.append("fizz");
    }
    
}
