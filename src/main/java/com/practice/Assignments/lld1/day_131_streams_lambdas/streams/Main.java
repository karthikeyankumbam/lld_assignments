package com.practice.Assignments.lld1.day_131_streams_lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(21,311,323,3,43,43,4,456,6);
        list.stream().filter(x->x%2==0).forEach(x-> System.out.println(x));
//        for(int x:list){
//            if(x%2==0) System.out.println(x);
//        }

        Optional<Integer> num = list.stream().filter(x -> {
            System.out.println(x+"  iam in fileter");
            return x % 2 == 0;
        }).map(y -> {
            System.out.println(y+" iam in map");
            return y * y;
        }).findFirst();


    }
}
