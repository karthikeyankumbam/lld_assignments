package com.practice.Assignments.lld2.day140adapterandfacade.facadeimage;

import com.practice.Assignments.lld2.day140adapterandfacade.facadeimage.models.Image;
import com.practice.Assignments.lld2.day140adapterandfacade.facadeimage.services.*;

public class ImageEditingFacade {
    // References to various services
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    // Constructor for the ImageProcessor class
    public ImageEditingFacade(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageLoader = imageLoader;
        this.filterService = filterService;
        this.imageModifier = imageModifier;
        this.imageWriter = imageWriter;
        this.analyticsService = analyticsService;
    }

    // The process method provides a simplified interface for performing image processing.
    public void process(String imagePath, String filterType, int brightness) {

        // Step 1: Load the image
        Image image = imageLoader.loadImage(imagePath);

        // Step 2: Apply the filter to the image
        filterService.applyFilter(image, filterType);

        // Step 3: Adjust the brightness of the image
        imageModifier.adjustBrightness(image, brightness);

        // Step 4: Save the image
        imageWriter.saveImage(image);

        // Step 5: Store the image in the analytics service
        analyticsService.store(image);
    }
}

