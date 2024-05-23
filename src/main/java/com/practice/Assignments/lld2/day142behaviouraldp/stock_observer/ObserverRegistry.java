package com.practice.Assignments.lld2.day142behaviouraldp.stock_observer;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Long taskId, Long userId);
}
