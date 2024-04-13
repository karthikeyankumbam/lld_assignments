package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
        System.out.println("Iam printing the Text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}