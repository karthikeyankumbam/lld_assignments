package com.practice.Assignments.lld2.day142behaviouraldp.weather_observer;

// The Observer interface defines operations that all concrete observers must implement.
public interface Observer {
    void notifyObserver(double value); // Notifies the observer about a change in value
}