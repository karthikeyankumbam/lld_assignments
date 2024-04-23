package com.practice.Assignments.lld2.day139factory.factorynotification;

public abstract class Notification {
    private String recipient;
    private String message;

    // Constructor for the Notification class
    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract NotificationType notificationType();
    public abstract void sendNotification();

}
