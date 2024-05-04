package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.NotificationTemplate;

public abstract class Notification {

    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}