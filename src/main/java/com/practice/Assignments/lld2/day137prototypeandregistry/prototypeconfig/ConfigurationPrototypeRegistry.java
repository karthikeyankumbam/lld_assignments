package com.practice.Assignments.lld2.day137prototypeandregistry.prototypeconfig;

public interface ConfigurationPrototypeRegistry {

    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
