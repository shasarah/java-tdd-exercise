package com.odde.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shxia on 11/21/18.
 */
public class FizzBuzzTest {
    @Test
    public void testNumber(){
       assertEquals("Fizz", FizzBuzz.calc(3));
    }
}
