package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}
