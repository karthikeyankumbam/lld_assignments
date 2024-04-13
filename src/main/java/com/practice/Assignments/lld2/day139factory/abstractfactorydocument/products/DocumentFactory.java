package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products;


import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser.DocumentParser;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer.DocumentPrinter;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentProcessor createProcessor(String documentName);
    public abstract DocumentParser createParser(String path);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
    public abstract DocumentType supportsType();
}