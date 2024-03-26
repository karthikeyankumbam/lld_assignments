package com.practice.Assignments.lld1.day_130_collections.types_of_inheritence;

public class Main {
    public static void main(String[] args) {
        BBB b=new BBB();
        b.doSomething();
    }
}
class A{
    public void display(){

    }
}
class B extends  A{
    public void display(){

    }
}
class C extends  A{
    public void display(){

    }
}
/**  Java does not support multiple inheritence
class D extends  B,C{
    public void display(){

    }
}
 */
interface AA{
    void display();
}
interface BB {
    void display();
}
/** Multiple inheritence is allowed for interfaces not for classes */
class CC implements AA,BB{
    @Override
    public void display() {

    }
}
interface AAA{
    public static final int a=2;/** by default all attribute are public static and final; */
    public static final Main main = null;/** by default all attribute are public static and final; */
    void call();
    default void doSomething(){
        System.out.println("do some thing in interface AAA");
    }
}
class  BBB implements AAA{

    @Override
    public void call() {
        System.out.println("just call");
    }
    public void someLogic(){
        doSomething();
    }
//    public void doSomething(){
//        System.out.println("do some thing in class BBB");
//    }
}