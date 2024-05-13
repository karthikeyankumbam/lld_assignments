package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightgraphic;

import lombok.Data;

@ExtrinsicState
@Data
public class GraphicExtrinsicState {
    private int x, y; // Coordinates
    private GraphicIntrinsicState state;
}
