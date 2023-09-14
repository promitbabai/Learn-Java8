package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
public class SimpleStreamAPI {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,4,5,3,2,6);


        Stream<Integer> newStream =  numList.stream();
        //newStream.forEach(n->System.out.print(n +" "));

        Stream<Integer> sortedStream = newStream.sorted();
        //sortedStream.forEach(n->System.out.println(n + " "));

        Stream<Integer> squareStream = sortedStream.map(n->n*2);
        squareStream.forEach(n->System.out.print(n +" "));


        //The above 3 lines creates new STREAM in every line.
        //These intermediate operations can be pipelined.



        List<Integer> numList2 = Arrays.asList(1,4,5,3,2,6);
        numList2.stream()
                .sorted()
                .map(n->n+100)
                .forEach(n->System.out.println(n));
    }


}
