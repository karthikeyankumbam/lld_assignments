package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}