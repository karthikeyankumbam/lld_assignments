package com.practice.Assignments.lld2.day142behaviouraldp.strategy_streaming;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private String videoUrl;
    private VideoQuality videoQuality;
    private VideoCodec codec;
    private Integer bitrate;

    public Video(String videoUrl, VideoQuality videoQuality) {
        this.videoUrl = videoUrl;
        this.videoQuality = videoQuality;
    }
}