package com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate;

import java.util.List;

/**
 * The TranslationProviderAdapter interface defines operations that all concrete translation\
 * adapters must implement.
 */
public interface TranslationProviderAdapter {
    String translate(TranslationRequest request); // Translates the text in the request

    List<String> getSupportedLanguages(); // Returns a list of supported languages
}
