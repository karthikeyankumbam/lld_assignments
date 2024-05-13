package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightgraphic;

public interface FlyweightRegistry {

    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}
