package com.template;

import java.util.Arrays;
import java.util.OptionalInt;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a+b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if (number%2!=0){
            return false;
        }
        else return true;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        return Math.max(a, b);
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int v=1;
        for (int i = 1; i <= n; i++) {
            v*=i;
        }
        return v;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        StringBuilder inputReverse = new StringBuilder(input);
        return inputReverse.reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int min = array[0];
        for (int i=0; i < array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int suma =0;
        for(int i = 0;i<array.length;i++){
            suma+=array[i];
        }
        return suma;
    }

        // 10. Convert Celsius to Fahrenheit
        public double celsiusToFahrenheit(double celsius) {
            // TODO: Implement this method
            return (celsius * 9.0 / 5.0) + 32.0;
        }
    }
