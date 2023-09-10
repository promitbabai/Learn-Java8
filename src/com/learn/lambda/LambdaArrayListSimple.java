package com.learn.lambda;

import java.util.ArrayList;

public class LambdaArrayListSimple {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        //iterate this ArrayList in Java8 to print
        numbers.forEach( (n) -> {System.out.println(n); } );

    }
}
