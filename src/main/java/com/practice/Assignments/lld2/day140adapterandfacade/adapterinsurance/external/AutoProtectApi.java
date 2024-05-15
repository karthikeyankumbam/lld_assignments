package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.external;

import com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance.ApiUtils;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}