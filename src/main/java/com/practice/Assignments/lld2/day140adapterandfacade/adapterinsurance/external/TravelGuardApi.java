package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.external;


import com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.ApiUtils;

public class TravelGuardApi {

    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}