package com.practice.Assignments.lld2.day138prototypeandregistry.invoice;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry{
    private static Map<InvoiceType,Invoice> registry=new HashMap<>();

    @Override
    public void addPrototype(Invoice user) {
        registry.put(user.getType(),user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return registry.get(type).cloneObject();
    }
}