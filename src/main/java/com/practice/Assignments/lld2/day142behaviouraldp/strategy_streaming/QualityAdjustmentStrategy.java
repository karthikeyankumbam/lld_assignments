package com.practice.Assignments.lld2.day142behaviouraldp.strategy_streaming;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video stream(Video video);
}
