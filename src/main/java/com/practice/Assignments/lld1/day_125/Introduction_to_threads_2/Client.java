package com.practice.Assignments.lld1.day_125.Introduction_to_threads_2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Adder adder=new Adder(a,b);
        ScalerThread scalerThread=new ScalerThread(adder);
        scalerThread.start();;
    }
}
