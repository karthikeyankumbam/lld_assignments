package com.practice.Assignments.lld1.day_125.Introduction_to_threads_3;

import java.util.Scanner;

/**
 * *Raw Problem**
 * Write code to achieve the following
 * A class Client with a main method.
 * Client class shall take a number n as input.
 * A class called TableCreator which prints the multiplication table from 1 to 10 for a given number x
 * x times 1 is x
 * <p>
 * ..
 * <p>
 * x times 10 is 10x
 * Client should create a thread for every number between 1 to n, n included and
 * Pass it to TableCreator to print a multiplication table for that number.
 * Print format = 2 times 6 is 12
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            TableCreator t=new TableCreator(i);
            Thread thread=new Thread(t);
            thread.start();
        }
    }
}
