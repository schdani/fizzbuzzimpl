package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        final String stringNumber = String.valueOf(number);

        StringBuilder result = new StringBuilder();
        if (isFizzRuleApplicable(number, stringNumber)) {
            result.append("fizz");
        }
        if (isBuzzRuleApplicable(number, stringNumber)) {
            result.append("buzz");
        }
        if (isWizzRuleApplicable(number, stringNumber)) {
            result.append("wizz");
        }
        if (result.length() == 0) {
            return stringNumber;
        }
        return result.toString();
    }

    private boolean isFizzRuleApplicable(int number, final String stringNumber) {
        return number % 3 == 0 || stringNumber.contains("3");
    }

    private boolean isBuzzRuleApplicable(int number, final String stringNumber) {
        return number % 5 == 0 || stringNumber.contains("5");
    }
    
    private boolean isWizzRuleApplicable(int number, final String stringNumber) {
        return number % 7 == 0 || stringNumber.contains("7");
    }
}
