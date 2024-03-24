package com.practice.Assignments.lld1.day_129_collections_generics.cw.documents;

public class CsvDocument extends Document{
    public CsvDocument(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return String.format("CsvDocument= %s",content);
    }
}
