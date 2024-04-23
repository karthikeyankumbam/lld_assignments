package com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate.external;

import java.util.List;

import static com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate.external.ApiUtils.logGoogleGetSupportedLanguages;
import static com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate.external.ApiUtils.logGoogleTranslate;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}