package com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks;

import static com.practice.Assignments.lld2.day142behaviouraldp.strategy_stocks.TradingStrategyType.MOMENTUM;

public class MomentumStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return MOMENTUM;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
