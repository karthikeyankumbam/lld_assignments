package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance;

import com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.external.AutoProtectApi;

public class AutoProtectApiAdapter implements TravelInsuranceAdapter{
    AutoProtectApi autoProtectApi=new AutoProtectApi();
    @Override
    public void submitClaim(String userId, double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public String getStatusOfClaim(String id) {
        return autoProtectApi.getStatus(id).toString();
    }
}
