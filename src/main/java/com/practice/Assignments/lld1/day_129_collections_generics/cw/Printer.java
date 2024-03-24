package com.practice.Assignments.lld1.day_129_collections_generics.cw;

public class Printer<T> {
    T thingsToPrint;
    public Printer(T thingsToPrint){
        this.thingsToPrint=thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
    }
    public T get(){
        return thingsToPrint;
    }
}
