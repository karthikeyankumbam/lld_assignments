package com.practice.Assignments.lld1.day_129_collections_generics.cw.documents;

public class RunnablePrinter<D extends Runnable> {
    /** extends is used even for Interface;  */
    D doc;
    public RunnablePrinter(D doc){
        this.doc=doc;
    }
    public void print(){
        System.out.println(doc);
    }


}
