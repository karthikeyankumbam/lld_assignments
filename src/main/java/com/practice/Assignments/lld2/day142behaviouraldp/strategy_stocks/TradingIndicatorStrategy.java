package com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks;

public interface TradingIndicatorStrategy {

    TradingStrategyType supportsType();
    Double calculateIndicator(Stock stock); // Calculates the trading indicator based on the stock
}