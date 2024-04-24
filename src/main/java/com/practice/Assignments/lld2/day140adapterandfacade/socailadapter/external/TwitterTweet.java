package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external;

import lombok.Getter;

@Getter
public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;

    public TwitterTweet(String id, String tweet, Long userId) {
        this.id = id;
        this.tweet = tweet;
        this.userId = userId;
    }
}
