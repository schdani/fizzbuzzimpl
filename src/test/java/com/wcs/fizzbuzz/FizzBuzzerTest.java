package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private final FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3OrContainsA3() {
        assertEquals("fizz", fizzBuzzer.execute(3));
        assertEquals("fizz", fizzBuzzer.execute(6));
        assertEquals("fizz", fizzBuzzer.execute(13));
        assertEquals("fizz", fizzBuzzer.execute(103));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5OrContainsA5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
        assertEquals("buzz", fizzBuzzer.execute(52));
        assertEquals("buzz", fizzBuzzer.execute(50002));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15OrContainsA3OrA5() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7OrContainsA7() {
        assertEquals("wizz", fizzBuzzer.execute(7));
        assertEquals("wizz", fizzBuzzer.execute(49));
        assertEquals("wizz", fizzBuzzer.execute(7001));
    }
    
    @Test
    public void executeShouldReturnFizzWizzIfTheNumberIsDividableBy21() {
        assertEquals("fizzwizz", fizzBuzzer.execute(21));
        assertEquals("fizzwizz", fizzBuzzer.execute(42));
    }
    
    @Test
    public void executeShouldReturnBuzzWizzIfTheNumberIsDividableBy35() {
        assertEquals("buzzwizz", fizzBuzzer.execute(70));
        assertEquals("buzzwizz", fizzBuzzer.execute(140));
    }
    
    @Test
    public void executeShouldReturnFizzBuzzWizzIfTheNumberIsDividableBy105() {
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(105));
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(315));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("8", fizzBuzzer.execute(8));
    }

}
