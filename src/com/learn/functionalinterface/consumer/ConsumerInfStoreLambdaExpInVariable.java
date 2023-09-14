package com.learn.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Use Java's Consumer interface to store a lambda expression in a variable:
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2023-01-10
 */
public class ConsumerInfStoreLambdaExpInVariable {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(4);
        numList.add(9);
        numList.add(8);
        numList.add(1);

        Consumer <Integer> methodofConsumerInf = (n)-> { System.out.println(n); };

        numList.forEach(methodofConsumerInf);


    }
}
