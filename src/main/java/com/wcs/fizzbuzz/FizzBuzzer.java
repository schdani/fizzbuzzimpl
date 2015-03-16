package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("fizz");
        }
        if (number % 5 == 0) {
            result.append("buzz");
        }
        if (result.length() == 0) {
            return String.valueOf(number);
        }
        return result.toString();
    }
    
}
