package com.practice.Assignments.lld1.day_127_synchronization.cw;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count(0);
        Adder adder=new Adder(count);
        Substractor substractor=new Substractor(count);
        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(substractor);
        thread1.start();
        thread2.start();


//        thread1.join();
//        thread2.join();
        System.out.println(" num: "+count.num);
    }
}
