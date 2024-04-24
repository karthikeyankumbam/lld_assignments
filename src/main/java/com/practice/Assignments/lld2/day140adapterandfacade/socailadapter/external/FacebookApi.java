package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        ApiUtils.logFacebookGetPosts();
        return new ArrayList<>(Arrays.asList(new FacebookPost("1", "Hello World", 1L, 123456789L)));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        ApiUtils.logFacebookPostStatus();
    }
}