package com.practice.Assignments.lld2.day142behaviouraldp.stock_observer.services;

import com.practice.Assignments.lld2.day142behaviouraldp.stock_observer.Observer;
import com.practice.Assignments.lld2.day142behaviouraldp.stock_observer.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, userId));
    }
}