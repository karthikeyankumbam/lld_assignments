package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.client;

import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.FacebookApi;
import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.FacebookPost;
import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.TwitterApi;
import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.TwitterTweet;

import java.util.List;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}
