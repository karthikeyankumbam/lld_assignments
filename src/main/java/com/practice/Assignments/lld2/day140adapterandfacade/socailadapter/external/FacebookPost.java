package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external;

import lombok.Getter;


@Getter
public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public FacebookPost(String id, String status, Long userId, Long timestamp) {
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }
}
