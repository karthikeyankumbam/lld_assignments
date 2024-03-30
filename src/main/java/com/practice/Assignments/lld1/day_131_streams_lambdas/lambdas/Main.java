package com.practice.Assignments.lld1.day_131_streams_lambdas.lambdas;

public class Main {
    public static void main(String[] args) {
        A a=new A(){
            @Override
            public void show() {
                System.out.println("Iam anonymous Class");
            }
        };
        a.show();

        B b=new B(){
            @Override
            public void demo() {
                System.out.println("Iam anonymous Class child of abstarct class");
            }
        };
        b.demo();
        C c=new C(){
            @Override
            public void call() {
                System.out.println("Iam anonymous Class child of interface");
            }
        };
        c.call();
    }
}
 class A{
    public void show(){
        System.out.println("Iam class A");
    }
}
abstract class B{
   abstract void demo();
}
interface C{
    void call();
}
