package com.practice.Assignments.lld2.day142behaviouraldp.task_observer.services;

import com.practice.Assignments.lld2.day142behaviouraldp.task_observer.Observer;
import com.practice.Assignments.lld2.day142behaviouraldp.task_observer.utils.NotificationUtils;

public class SmsService implements Observer {

    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }
}
