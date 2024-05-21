package com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy;

import static com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy.PricingManager.*;

public class SurgeStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
