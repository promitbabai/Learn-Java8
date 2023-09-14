package com.learn.lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Consumer Interface represents a function which takes in one argument and produces a result.
 * However these kind of functions don’t return any value.
 * The Consumer interface consists of the following two functions:
 *      1. accept()
 *      2. andThen()
 *
 * This accept() method accepts one value and performs the operation on the given argument
 *      void accept(T t)
 * Parameters: This method takes in one parameter:
 *  t– the input argument
 * Returns: This method does not return any value.
 *
 * This andThen() method returns a composed Consumer wherein the parameterized Consumer will be executed after the first one. If evaluation of either function throws an error, it is relayed to the caller of the composed operation.
 * Note: The function being passed as the argument should be of type Consumer.
 * Syntax:
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2023-01-10
 */
public class LambdaArrayListConsumer {

    public static void main (String args []){

        // Consumer to display a number
        Consumer<Integer> displayMethod = a -> System.out.println(a);

        // Implement display using accept()
        displayMethod.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        // Implement modify using accept()
        modify.accept(list);

        // Implement dispList using accept()
        dispList.accept(list);

    }
}
