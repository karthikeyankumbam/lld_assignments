package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;

public abstract class NotificationTemplate {
    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String applyTemplate();
    public abstract NotificationType notificationType();

}
