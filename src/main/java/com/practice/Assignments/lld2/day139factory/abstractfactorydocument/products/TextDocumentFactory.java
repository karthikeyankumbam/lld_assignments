package com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products;

import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentFactory;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.DocumentType;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser.DocumentParser;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.parser.TextDocumentParser;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer.DocumentPrinter;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.printer.TextDocumentPrinter;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.DocumentProcessor;
import com.practice.Assignments.lld2.day139factory.abstractfactorydocument.products.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {


    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
