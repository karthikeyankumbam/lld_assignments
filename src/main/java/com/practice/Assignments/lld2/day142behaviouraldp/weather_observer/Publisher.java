package com.practice.Assignments.lld2.day142behaviouraldp.weather_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Observer> observers = new ArrayList<>(); // The list of observers

    public void addObserver(Observer observer) {
        observers.add(observer); // Adds an observer to the list
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer); // Removes an observer from the list
    }

    protected void notifyObservers(double value) {
        observers.forEach(observer -> observer.notifyObserver(value)); // Notifies all observers about a change in value
    }
}
