package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API Intermediate Operations
 *      1) Methods are chained together.
 *      2) Intermediate operations transform a stream into another stream.
 *      3) It enables the concept of filtering where one method filters data and passes it to another method after processing.
 *
 * Important Intermediate Operations
 *      1. map() - used to return a stream consisting of the results of applying the given function to the elements of this stream.
 *      2. filter() - used to select elements as per the Predicate passed as an argument.
 *      3. sorted() - used to sort the stream.
 *        filter()
 *        map()
 *        flatMap()
 *        distinct()
 *        sorted()
 *        peek()
 *        limit()
 *        skip()
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2023-01-10
 */
public class StreamAPIIntermediateOperations {

    public static void main(String[] args) {

     /*   //1. map()
        List number = Arrays.asList(2,3,4,5);
        List square = number.stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        //2. filter()
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream()
                        .filter(s->s.startsWith("S"))
                        .collect(Collectors.toList());


        //3. sorted()
        List names2 = Arrays.asList("Reflection","Collection","Stream");
        List result2 = names2.stream()
                        .sorted()
                        .collect(Collectors.toList());*/

    }



}
