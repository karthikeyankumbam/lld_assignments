package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
