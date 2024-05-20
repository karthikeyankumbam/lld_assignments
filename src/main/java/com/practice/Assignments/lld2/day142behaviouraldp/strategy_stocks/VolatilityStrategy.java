package com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks;

import static com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks.TradingStrategyType.VOLATILITY;

public class VolatilityStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return VOLATILITY;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
