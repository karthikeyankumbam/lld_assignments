package com.practice.Assignments.lld2.day140adapterandfacade.facadebooking;

import com.practice.Assignments.lld2.day140adapterandfacade.facadebooking.models.BookingResult;
import com.practice.Assignments.lld2.day140adapterandfacade.facadebooking.services.*;

import java.time.LocalDate;

public class BookingManager {
    private BookingFacade bookingFacade;


    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        this.bookingFacade= new BookingFacade(availabilityService, paymentService, notificationService,
                loyaltyService, accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return this.bookingFacade.bookAccommodation(userId, accommodationId, checkInDate, checkOutDate);
    }

}
