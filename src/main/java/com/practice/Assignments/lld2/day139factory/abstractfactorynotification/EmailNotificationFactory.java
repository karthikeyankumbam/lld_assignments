package com.practice.Assignments.lld2.day139factory.abstractfactorynotification;

import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.EmailNotification;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.notification.Notification;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender.EmailNotificationSender;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.sender.NotificationSender;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.EmailNotificationTemplate;
import com.practice.Assignments.lld2.day139factory.abstractfactorynotification.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient,sender,template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new EmailNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}