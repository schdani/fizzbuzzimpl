package com.wcs.fizzbuzz;

import com.wcs.fizzbuzz.rules.*;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzer {
    
    private static final List<Rule> RULES = Arrays.asList(
            new FizzRule(),
            new BuzzRule(),
            new WizzRule()
    );

    public String execute(int number) {
        StringBuilder result = new StringBuilder();
        
        for (Rule rule : RULES) {
            if (rule.isApplicable(number)) {
                rule.apply(result);
            }
        }
        
        if (result.length() == 0) {
            result.append(number);
        }
        
        return result.toString();
    }
}
