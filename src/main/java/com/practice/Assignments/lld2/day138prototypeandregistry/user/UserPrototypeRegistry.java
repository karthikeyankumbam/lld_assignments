package com.practice.Assignments.lld2.day138prototypeandregistry.user;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
