package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter;

import java.util.List;

public interface SocialMediaAdapter {

    List<SocialMediaPost> getPosts(Long userId, Long timestamp);

    void post(Long userId, String message);
}