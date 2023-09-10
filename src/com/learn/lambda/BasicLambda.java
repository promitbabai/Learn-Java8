package com.learn.lambda;


interface Addable{
    int add(int a,int b);
}
public class BasicLambda {

    public static void main(String[] args) {
        System.out.println("Multiple parameters in lambda expression");

        Addable obj1 = (a,b)-> (a+b);
        System.out.println(obj1.add(100, 200));

    }
}
