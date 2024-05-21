package com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy;

import static com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy.PricingManager.BASE_FARE;
import static com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy.PricingManager.PER_KILOMETER_RATE;

public class DistanceBasedStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
    }
}
