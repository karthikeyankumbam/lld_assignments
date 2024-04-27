package com.practice.Assignments.lld2.day139factory.factorydocument;

public class DocumentProcessorFactory {
    public static DocumentProcessor createDocumentProcessor(DocumentType type,String name){
        return switch (type){
            case TEXT -> new TextDocumentProcessor(name);
            case PRESENTATION -> new PresentationDocumentProcessor(name);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(name);
            default -> throw new IllegalArgumentException("Invalid Input");
        };
    }
}
