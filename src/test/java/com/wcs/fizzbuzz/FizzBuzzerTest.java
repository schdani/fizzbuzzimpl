package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private final FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15OrContainsA3OrA5() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
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
