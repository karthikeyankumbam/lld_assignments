package com.practice.Assignments.lld1.day_125.Introduction_to_threads_3;

public class TableCreator implements Runnable{
    int num;
    public TableCreator(int num){
        this.num=num;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("x times "+i +"is "+(i*num));
        }
    }
}
