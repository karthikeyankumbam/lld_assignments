package com.practice.Assignments.lld1.day_129_collections_generics.cw.documents;

public class DocumentPrinter<D extends Document> {
    D doc;
    public DocumentPrinter(D doc){
        this.doc=doc;
    }
    public void print(){
        System.out.println(doc);
    }


}
