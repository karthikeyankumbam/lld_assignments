package com.practice.Assignments.lld2.day139factory.factorynotification;


// Factory method for creating the appropriate notification based on the notification type
// Factory class for creating notifications
public class NotificationFactory {
    // Factory method for creating the appropriate notification based on the notification type
    public static Notification createNotification(NotificationType notificationType, String recipient, String message, String sender) {
        return switch (notificationType) {
            case EMAIL -> new EmailNotification(recipient, sender, message);
            case SMS -> new SmsNotification(recipient, message);
            case PUSH -> new PushNotification(recipient, message);
            default -> throw new IllegalArgumentException("Invalid notification type");
        };
    }
}
