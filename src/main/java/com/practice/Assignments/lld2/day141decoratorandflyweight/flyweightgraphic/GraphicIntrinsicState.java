package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightgraphic;


import lombok.Data;

@IntrinsicState
@Data
public class GraphicIntrinsicState {
    private GraphicType type; // "text" or "image"
    private Image image; // Text content or image file path
    private String color; // Font color for text or image format for images
    private int width, height; // Dimensions
}
