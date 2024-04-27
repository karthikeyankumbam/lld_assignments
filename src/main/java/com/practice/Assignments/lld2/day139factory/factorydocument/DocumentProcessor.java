package com.practice.Assignments.lld2.day139factory.factorydocument;

public abstract class DocumentProcessor {
    protected String documentName;
    public abstract DocumentType supportsType();
    public abstract String getDocumentName();
    public abstract void processDocument();
}