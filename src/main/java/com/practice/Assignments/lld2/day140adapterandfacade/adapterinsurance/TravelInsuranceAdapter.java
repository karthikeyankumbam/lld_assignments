package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance;

public interface TravelInsuranceAdapter {
    public void submitClaim(String userId, double amount);

    public String getStatusOfClaim(String id);
}
