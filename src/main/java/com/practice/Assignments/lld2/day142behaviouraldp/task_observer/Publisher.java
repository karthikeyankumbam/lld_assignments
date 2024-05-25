package com.practice.Assignments.lld2.day142behaviouraldp.task_observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher  implements ObserverRegistry {
    private List<Observer> observers = new ArrayList<>(); // The list of observers

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); // Adds an observer to the list
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); // Removes an observer from the list
    }

    @Override
    public void notifyObservers(String stockName, double currentPrice) {
        observers.forEach(observer -> observer.notifyObserver(stockName, currentPrice)); // Notifies all observers about a change in the stock price
    }
}
