package com.practice.Assignments.lld2.day142behaviouraldp.pricing_strategy;

public class PricingManager {

    private PricingType pricingType;

    public static final double BASE_FARE = 5.0; // Base fare amount
    public static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    public static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    public static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    private PricingStrategy pricingStrategy;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy){
        this.pricingType=pricingType;
        this.pricingStrategy=pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculate(rideDetails);
    }

}