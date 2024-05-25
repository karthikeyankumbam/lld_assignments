package com.practice.Assignments.lld2.day142behaviouraldp.task_observer;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);
}