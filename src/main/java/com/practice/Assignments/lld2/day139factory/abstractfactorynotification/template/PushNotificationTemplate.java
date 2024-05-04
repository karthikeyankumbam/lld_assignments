package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;

public class PushNotificationTemplate extends NotificationTemplate{
    public PushNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Push notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}