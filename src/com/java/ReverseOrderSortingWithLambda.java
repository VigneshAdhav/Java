package com.java;

import java.util.Set;
import java.util.TreeSet;

public class ReverseOrderSortingWithLambda {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>((num1, num2) -> num2.compareTo(num1)); 

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(2);
        numbers.add(8);

        numbers.forEach(System.out::println);
    }
}
