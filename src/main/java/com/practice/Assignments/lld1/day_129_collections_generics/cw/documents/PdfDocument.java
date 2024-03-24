package com.practice.Assignments.lld1.day_129_collections_generics.cw.documents;



public class PdfDocument extends Document implements Runnable{
    public PdfDocument(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return String.format("PdfDocument = %s",content);
    }

    @Override
    public void run() {

    }
}
