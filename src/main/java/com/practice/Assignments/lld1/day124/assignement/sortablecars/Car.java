package com.practice.Assignments.lld1.day124.assignement.sortablecars;


public class Car implements Comparable<Car>{
    private int price;
    private String name;
    public Car (int price, String name){
        this.name=name;
        this.price=price;
    }

    @Override
    public int compareTo(Car anotherCar){
        return this.price - anotherCar.price;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
