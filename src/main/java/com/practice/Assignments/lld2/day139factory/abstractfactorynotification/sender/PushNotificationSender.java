package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.Notification;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}