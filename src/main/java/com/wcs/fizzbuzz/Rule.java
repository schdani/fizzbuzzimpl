package com.wcs.fizzbuzz;

/**
 *
 * @author thomas
 */
public interface Rule {
    
    boolean isApplicable(int number);
    void apply(StringBuilder value);
}
