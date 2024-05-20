package com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks;

import static com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks.TradingStrategyType.MOVING_AVERAGES;

public class MovingAveragesStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return MOVING_AVERAGES;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}
