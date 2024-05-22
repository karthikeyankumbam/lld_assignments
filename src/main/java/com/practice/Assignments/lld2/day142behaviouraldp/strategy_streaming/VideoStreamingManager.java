package com.practice.Assignments.lld2.day142behaviouraldp.strategy_streaming;

public class VideoStreamingManager {
    private final Video video;
    private final QualityAdjustmentStrategy qualityAdjustmentStrategy;

    public VideoStreamingManager(Video video,QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        return qualityAdjustmentStrategy.stream(video);
    }
}
