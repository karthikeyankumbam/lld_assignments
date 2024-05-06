package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightdocument;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}
