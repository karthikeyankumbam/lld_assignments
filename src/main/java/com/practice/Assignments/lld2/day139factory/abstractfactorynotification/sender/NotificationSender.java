package com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.NotificationType;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}
