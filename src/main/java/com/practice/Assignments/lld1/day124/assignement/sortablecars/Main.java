package com.practice.Assignments.lld1.day124.assignement.sortablecars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(25000,"Suv"));
        cars.add(new Car(20000,"Fortuner"));
        cars.add(new Car(30000,"Indica"));
        cars.add(new Car(18000,"Tesla"));
        Collections.sort(cars);
        System.out.println(cars);
    }
}
