package com.practice.Assignments.lld1.day_129_collections_generics;

public class Printer<T> {
    T thingsToPrint;
    public Printer(T thingsToPrint){
        this.thingsToPrint=thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
    }
}
