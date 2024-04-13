package com.practice.Assignments.lld2.day138prototypeandregistry.prototypeconfig;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {
    private Map<ConfigurationType, Configuration> registry=new HashMap<>();
    @Override
    public void addPrototype(Configuration user) {
        registry.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return registry.get(type).cloneObject();
    }
}
