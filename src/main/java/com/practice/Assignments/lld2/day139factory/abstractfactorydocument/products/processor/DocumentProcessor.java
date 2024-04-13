package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}