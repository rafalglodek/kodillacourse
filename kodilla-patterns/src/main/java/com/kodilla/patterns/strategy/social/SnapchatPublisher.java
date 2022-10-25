package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "[Snapchat Publisher] Snapchat Publisher is publishing on Snapchat";
    }

}
