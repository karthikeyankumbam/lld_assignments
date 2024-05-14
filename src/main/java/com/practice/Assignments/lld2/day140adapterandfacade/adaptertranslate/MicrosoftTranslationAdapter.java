package com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate;

import com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {
    private MicrosoftTranslateApi translateApi = new MicrosoftTranslateApi(); // An instance of the adaptee class

    // The translate method calls the translate method of the MicrosoftTranslateApi.
    @Override
    public String translate(TranslationRequest request) {
        return translateApi.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    // The getSupportedLanguages method returns the list of languages supported by the MicrosoftTranslateApi.
    @Override
    public List<String> getSupportedLanguages() {
        return translateApi.getSupportedLanguages();
    }
}