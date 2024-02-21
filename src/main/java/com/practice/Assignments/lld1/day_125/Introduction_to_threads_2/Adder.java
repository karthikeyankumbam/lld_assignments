package com.practice.Assignments.lld1.day_125.Introduction_to_threads_2;

public class Adder implements Runnable{
    int x;
    int y;
    Adder(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void run() {
        System.out.println(this.x+this.y);
    }
}
