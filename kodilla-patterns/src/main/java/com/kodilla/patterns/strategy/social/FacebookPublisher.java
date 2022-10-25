package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements  SocialPublisher {

    @Override
    public String share() {
        return "[FaceBook Publisher] FaceBook Publisher is publishing on FaceBook";
    }
}
