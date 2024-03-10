package com.practice.Assignments.lld1.day_127_synchronization.cw.sync2;

public class Count {
    int num;
    public Count(int num){
        this.num=num;
    }
    public synchronized void increment(){
        num++;
    }
    public synchronized void decrement(){
        num--;
    }
}
