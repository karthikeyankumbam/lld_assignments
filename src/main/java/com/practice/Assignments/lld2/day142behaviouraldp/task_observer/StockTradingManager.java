package com.practice.Assignments.lld2.day142behaviouraldp.task_observer;

import com.practice.Assignments.lld2.day142behaviouraldp.task_observer.services.AppService;
import com.practice.Assignments.lld2.day142behaviouraldp.task_observer.services.EmailService;
import com.practice.Assignments.lld2.day142behaviouraldp.task_observer.services.SmsService;

public class StockTradingManager extends Publisher {
    private String stockName;
    private double currentPrice;
    private double notificationThreshold;


    // DO NOT MODIFY THIS CONSTRUCTOR
    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice; // Updates the current price
        if (currentPrice > notificationThreshold) {
            notifyObservers(stockName, currentPrice); // If the current price is greater than the notification threshold, notifies all observers
        }
    }

}
