package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
        System.out.println("Iam printing the Spreadsheet");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
