package com.practice.Assignments.lld1.day_129_collections_generics.cw.documents;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PdfDocument pdf=new PdfDocument("Iam PDF");
        DocumentPrinter<PdfDocument> pdfPrinter=new DocumentPrinter<>(pdf);
        pdfPrinter.print();
        CsvDocument csv =new CsvDocument("Iam CSV");
        DocumentPrinter<CsvDocument> csvPrinter=new DocumentPrinter<>(csv);
        csvPrinter.print();
        /**
         * It will give error because its not extended with Document class
        Student student=new Student(10,"Rahul");
        DocumentPrinter<Student> documentPrinter=new DocumentPrinter<>(student);
        documentPrinter.print();
         */

        /** In which pdfdocument implemented runnable interface */
        RunnablePrinter<PdfDocument> pdfPrinter2=new RunnablePrinter<>(pdf);

        Student student=new Student(10,"Rahul");
//        genericMethod(student);
        genericMethod(pdf);
        System.out.println(get(pdf));
        printDocs(List.of(pdf,csv));
    }
    public static <T extends Document> void genericMethod(T doc){
        System.out.println(doc);
    }
    public static <T extends Document> T get(T doc){
        return doc;
    }
    /**  create a method in which it accepts list of pdfs , docs and csv s */
    public static <T extends Document>  void printDocs(List<T> docs){
        docs.stream().forEach(doc-> System.out.println(doc));
    }
}

