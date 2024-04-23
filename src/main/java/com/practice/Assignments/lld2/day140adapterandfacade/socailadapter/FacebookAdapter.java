package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter;

import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.FacebookApi;
import com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external.FacebookPost;

import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter {
    private FacebookApi facebookApi = new FacebookApi();
    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return facebookApi.fetchFacebookPosts(userId, timestamp).stream().map(FacebookAdapter::to).toList();
    }

    private static SocialMediaPost to(FacebookPost post) {
        return new SocialMediaPost(post.getId(), post.getStatus(), post.getUserId(), post.getTimestamp());
    }

    @Override
    public void post(Long userId, String message) {
        facebookApi.postFacebookStatus(userId, message);
    }
}
