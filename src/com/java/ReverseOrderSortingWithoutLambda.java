package com.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseOrderSortingWithoutLambda {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2.compareTo(num1); 
            }
        });

        
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(2);
        numbers.add(8);

        
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
