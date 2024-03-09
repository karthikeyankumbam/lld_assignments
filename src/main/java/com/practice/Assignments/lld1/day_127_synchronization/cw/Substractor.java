package com.practice.Assignments.lld1.day_127_synchronization.cw;

public class Substractor implements Runnable{
    private Count count;
    public Substractor(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=1;i<10000;i++){
            count.num--;
            System.out.println("substractor i "+i+" num: "+count.num);
        }
    }
}
