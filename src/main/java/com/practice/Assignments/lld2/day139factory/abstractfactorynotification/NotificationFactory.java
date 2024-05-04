package com.practice.Assignments.lld2.day139factory.abstractfactorynotification;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.Notification;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender.NotificationSender;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.NotificationTemplate;

public abstract class NotificationFactory {
    // Abstract method for getting the type of notification the factory supports
    public abstract NotificationType notificationType();

    // Abstract methods for creating different parts of a notification system
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String templateName);
    public abstract NotificationSender createSender(Notification notification);
}
