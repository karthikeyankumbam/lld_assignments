package com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy;

import static com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy.PricingManager.*;

public class TimeBasedStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
