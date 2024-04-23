package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external;

import java.util.List;

public class TwitterApi {

    public List<TwitterTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        ApiUtils.logTwitterGetPosts();
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        ApiUtils.logTwitterPostStatus();
    }
}

