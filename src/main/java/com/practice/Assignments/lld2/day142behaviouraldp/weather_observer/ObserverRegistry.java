package com.practice.Assignments.lld2.day142behaviouraldp.weather_observer;

// The ObserverRegistry interface defines operations for managing observers.
public interface ObserverRegistry {
    void addObserver(Observer observer); // Adds an observer

    void removeObserver(Observer observer); // Removes an observer

    void notifyObservers(double value); // Notifies all observers about a change in value
}

