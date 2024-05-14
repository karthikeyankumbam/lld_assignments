package com.practice.Assignments.lld2.day140adapterandfacade.adaptertranslate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TranslationRequest {
    private String text; // The text to be translated
    private String sourceLanguage; // The source language of the text
    private String targetLanguage; // The target language for the translation
    private Double confidenceThreshold; // The confidence threshold for the translation
}
