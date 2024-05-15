package com.practice.Assignments.lld2.day140adapterandfacade.adapterinsurance;

public class ApiUtils {
    public static void logAutoProtectClaimCall() {
        System.out.println("Submitting claim to AutoProtect");
    }

    public static void logAutoProtectStatusCall() {
        System.out.println("Getting claim status from AutoProtect");
    }

    public static void logTravelGuardClaimCall() {
        System.out.println("Getting claim status from TravelGuard");
    }

    public static void logTravelGuardStatusCall() {
        System.out.println("Submitting claim to TravelGuard");
    }
}
