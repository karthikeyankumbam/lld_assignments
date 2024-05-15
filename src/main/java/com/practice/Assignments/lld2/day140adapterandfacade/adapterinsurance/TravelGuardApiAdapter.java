package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance;

import com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.external.TravelGuardApi;

public class TravelGuardApiAdapter implements TravelInsuranceAdapter{
    TravelGuardApi travelGuardApi=new TravelGuardApi();
    @Override
    public void submitClaim(String userId, double amount) {
        travelGuardApi.submitClaim(userId,amount);
    }

    @Override
    public String getStatusOfClaim(String id) {
        return travelGuardApi.getClaimStatus(id);
    }
}
