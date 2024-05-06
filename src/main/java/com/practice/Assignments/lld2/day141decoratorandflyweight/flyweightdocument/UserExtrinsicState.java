package com.practice.Assignments.lld2.day141decoratorandflyweight.flyweightdocument;

import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private Colour colour; // The colour associated with the user
    private int currentGameStreak; // The current game streak of the user
    private UserIntrinsicState user; // The intrinsic state of the user
}
