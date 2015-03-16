package com.wcs.fizzbuzz.rules;

/**
 *
 * @author thomas
 */
public interface Rule {
    
    boolean isApplicable(int number);
    void apply(StringBuilder value);
}
