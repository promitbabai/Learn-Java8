package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Different Operations On Streams
 * There are two types of Operations in Streams:
 *      a) Intermediate Operations
 *      b) Terminate Operations
 * Intermediate Operations are the types of operations in which multiple methods are chained in a row.
 *
 * Characteristics of Intermediate Operations
 *      1) Methods are chained together.
 *      2) Intermediate operations transform a stream into another stream.
 *      3) It enables the concept of filtering where one method filters data and passes it to another method after processing.
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2023-01-10
 */
public class SmallestNumberInArray {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(5,4,9,23,2,16);


        int minNumber1 = numList.stream().min(Integer::compare).get();
        System.out.println("Smallest Number in Array using Compare = " + minNumber1);


       /* Stream<Integer> newStream =  numList.stream();
        //newStream.forEach(n->System.out.print(n +" "));

        Stream<Integer> sortedStream = newStream.sorted();
        //sortedStream.forEach(n->System.out.println(n + " "));

        Stream<Integer> squareStream = sortedStream.map(n->n*2);
        squareStream.forEach(n->System.out.print(n +" "));
*/



    }


}

