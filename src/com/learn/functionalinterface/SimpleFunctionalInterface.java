package com.learn.functionalinterface;
/**
 * A Functional Interface is an interface that has exactly one abstract method.
 * To designate an interface as a Functional Interface, we don’t need to use the @FunctionalInterface annotation.
 *
 * The @FunctionalInterface annotation prevents abstract methods from being accidentally added to functional interfaces
 * Lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of the examples of functional interfa
 *
 *
 * @author  Promit Majumder
 * @version 1.0
 * @since   2023-01-10
 */

@FunctionalInterface
interface Square {
    int calculate(int x);
}
public class SimpleFunctionalInterface {


    public static void main(String args[])
    {
        int a = 10;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }

}
