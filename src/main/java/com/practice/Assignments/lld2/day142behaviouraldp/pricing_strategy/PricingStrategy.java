package com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy;

public interface PricingStrategy {
    PricingType supportsType();
    Double calculate(RideDetails rideDetails);
}
