package com.odde.tdd;

/**
 * Created by shxia on 11/21/18.
 *
 * 3* Fizz
 * 5* Buzz
 * 3*5* FizzBuzz
 */
public class FizzBuzz {

    // No static
    public static String calc(int num) {
        // TODO: add check
        if (num%15 == 0) return "FizzBuzz";
        else if (num%3 == 0) return "Fizz";
        else if (num%5 == 0) return "Buzz";
        else return Integer.toString(num);
    }

    public static void main(String args[]){
        int num = 15;
        System.out.println(calc(num));


    }
}
