package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentFactory;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser.DocumentParser;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser.SpreadsheetDocumentParser;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer.DocumentPrinter;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer.SpreadsheetDocumentPrinter;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {


    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
