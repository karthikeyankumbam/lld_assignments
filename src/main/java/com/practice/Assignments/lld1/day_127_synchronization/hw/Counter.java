package com.practice.Assignments.lld1.day_127_synchronization.hw;

public class Counter {
    private int count;
    public Counter(int count){
        this.count=count;
    }
    public synchronized void incValue(int offset){
        this.count+=offset;
    }
    public synchronized int getValue(){
        return this.count;
    }
    public synchronized void deccValue(int offset){
        this.count-=offset;
    }
}
