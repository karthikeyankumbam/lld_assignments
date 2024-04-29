package com.practice.Assignments.lld1.day_126.classwork.threadswithcallables;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ExecutorService es= Executors.newSingleThreadExecutor();
        ArrayCreator ac=new ArrayCreator(n);
        Future<ArrayList<Integer>> result=es.submit(ac);
        System.out.println(result.get());
    }
}
