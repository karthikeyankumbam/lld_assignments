package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightdocument;

import lombok.Getter;

@IntrinsicState
@Getter
public class UserIntrinsicState {
    private String name; // The name of the user
    private int age; // The age of the user
    private String gender; // The gender of the user
    private String email; // The email of the user
    private String phoneNumber; // The phone number of the user
    private Byte[] photo; // The photo of the user
}
