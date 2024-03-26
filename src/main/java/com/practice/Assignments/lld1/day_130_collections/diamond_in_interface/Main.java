package com.practice.Assignments.lld1.day_130_collections.diamond_in_interface;

public class Main {
    /** Find out why default method wont cause diamond problem  */
}
interface AA{
    default void doSomething(){
        System.out.println("Iam in interface AA");
    }
}
interface BB {
    default void doSomething(){
        System.out.println("Iam in interface BB");
    }
}
class CC implements AA,BB{

    @Override
    public void doSomething() {
        BB.super.doSomething();
    }
}