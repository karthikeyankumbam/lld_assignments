package com.practice.Assignments.lld2.day140adapterandfacade.socailadapter.external;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;
}
