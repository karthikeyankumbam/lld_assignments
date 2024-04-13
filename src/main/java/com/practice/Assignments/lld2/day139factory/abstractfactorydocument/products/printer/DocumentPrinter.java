package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}