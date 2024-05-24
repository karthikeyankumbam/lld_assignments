package com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.services;


import com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.Observer;
import com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.utils.NotificationUtils;

public class TemperatureService implements Observer {

    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}