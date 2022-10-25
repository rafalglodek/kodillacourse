package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultPublishingStrategies() {
        //Given
        User facebookUser = new Millenials("FaceBook User");
        User twitterUser = new YGeneration("Twitter User");
        User snapchatUser = new ZGeneration("Snapchat User");
        //When
        String faceBookUserIsPublishing = facebookUser.sharePost();
        String twitterUserIsPublishing = twitterUser.sharePost();
        String snapchatUserIsPublishing = snapchatUser.sharePost();

        System.out.println("FaceBook User: " + faceBookUserIsPublishing);
        System.out.println("Twitter User: " + twitterUserIsPublishing);
        System.out.println("Snapchat User: " + snapchatUserIsPublishing);
        //Then
        assertEquals("[FaceBook Publisher] FaceBook Publisher is publishing on FaceBook", faceBookUserIsPublishing);
        assertEquals("[Twitter Publisher] Twitter Publisher is publishing on Twitter", twitterUserIsPublishing);
        assertEquals("[Snapchat Publisher] Snapchat Publisher is publishing on Snapchat", snapchatUserIsPublishing);


    }
    @Test
    void testDefaultInvestingStrategies() {
        //Given
        User facebookUser = new Millenials("FaceBook User");
        //When
        facebookUser.setSocialPublisher(new SnapchatPublisher());
        String faceBookUserIsPublishing = facebookUser.sharePost();
        System.out.println("FaceBook User: " + faceBookUserIsPublishing);
        //Then
        assertEquals("[Snapchat Publisher] Snapchat Publisher is publishing on Snapchat", faceBookUserIsPublishing);
    }
}
