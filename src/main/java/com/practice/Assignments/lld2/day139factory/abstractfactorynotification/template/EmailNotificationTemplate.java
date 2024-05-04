package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate{
    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
