package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        final String stringNumber = String.valueOf(number);

        StringBuilder result = new StringBuilder();
        if (number % 3 == 0 || stringNumber.contains("3")) {
            result.append("fizz");
        }
        if (number % 5 == 0 || stringNumber.contains("5")) {
            result.append("buzz");
        }
        if (number % 7 == 0 || stringNumber.contains("7")) {
            result.append("wizz");
        }
        if (result.length() == 0) {
            return stringNumber;
        }
        return result.toString();
    }

}
