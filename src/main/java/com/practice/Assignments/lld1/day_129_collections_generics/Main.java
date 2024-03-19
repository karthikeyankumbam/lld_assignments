package com.practice.Assignments.lld1.day_129_collections_generics;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        int num=10;
        Boolean b=false;/** Non primitive Data type  */
        Integer n=num;/** Autoboxing  */
        num=n;        /** Unboxing   */
        System.out.println(num);
        ArrayDeque<Integer> in;
        /** Using generics  */
        Printer<Integer> integerPrinter=new Printer<>(1);
        integerPrinter.print();
        Printer<String> stringPrinter=new Printer<>("Hey hi");
        stringPrinter.print();
        Printer<Boolean> booleanPrinter=new Printer<>(true);
        booleanPrinter.print();
    }
}
