package com.practice.Assignments.lld2.day140adapterandfacade.facadebooking.services;


import com.practice.Assignments.lld2.day140adapterandfacade.facadebooking.models.PaymentStatus;

public class PaymentService {

    public PaymentStatus makePayment(String userId, String accommodationId) {
        // Logic to process payment
        return PaymentStatus.SUCCESS; // Placeholder
    }

    public double calculatePaymentAmount(String accommodationId) {
        // Logic to calculate payment amount
        return 0.0; // Placeholder
    }
}
