package com.practice.Assignments.lld1.day_125.Introduction_to_threads_2;

import java.util.Scanner;

/**
 * **Raw Problem**
 * Write code to achieve the following
 * A class Client with a main method.
 * Client class shall take two numbers as input from the user.
 * Client class should create a new thread and invoke code in a class called Adder.
 * Client class shall pass two numbers (taken as input from the user) to the Adder class.
 * The Adder class should print the sum of two numbers passed to it.
 * <p>
 * Important Note - Use the ScalerThread class to create new threads. This is necessary for testing your code.
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Adder adder = new Adder(a, b);
        ScalerThread scalerThread = new ScalerThread(adder);
        scalerThread.start();
        ;
    }
}
