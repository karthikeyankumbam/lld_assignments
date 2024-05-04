package com.practice.Assignments.lld2.day139factory.abstractfactorynotification;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.Notification;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.PushNotification;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender.NotificationSender;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender.PushNotificationSender;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.NotificationTemplate;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient,template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new PushNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
}
