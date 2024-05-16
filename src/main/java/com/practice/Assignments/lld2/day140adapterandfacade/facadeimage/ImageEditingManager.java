package com.practice.Assignments.lld2.day140adapterandfacade.facadeimage;

import com.practice.Assignments.lld2.day140adapterandfacade.facadeimage.services.*;

public class ImageEditingManager {

    private ImageEditingFacade imageProcessor;

    // Constructor for the ImageEditingManager class
    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageProcessor = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    // The editImage method provides a simplified interface for editing an image.
    public void editImage(String imagePath, String filterType, int brightness) {
        imageProcessor.process(imagePath, filterType, brightness);
    }


}