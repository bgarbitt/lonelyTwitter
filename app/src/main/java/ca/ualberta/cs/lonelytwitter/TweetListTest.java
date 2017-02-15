/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import java.util.ArrayList;

/**
 * Created by brettgarbitt on 2017-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    /**
     * To check this test class, we can right click on TweetListTest
     * and select 'run TweetListTest with coverage'
     */
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet");
        // should throw an IllegalArgumentException when one tries to
        // add a duplicate tweet

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDoubleTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet different");
        // should throw an IllegalArgumentException when one tries to
        // add a duplicate tweet
        tweets.add(tweet);

        try {
            tweets.add(tweet);
            fail();
        } catch (IllegalArgumentException exception) {

        };
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweetish");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetList(){
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweetybird");
        Tweet tweet2 = new NormalTweet("test tweeticbirds");

        tweets.add(tweet);
        tweets.add(tweet2);
        tweetList.add(tweet);
        tweetList.add(tweet2);

        ArrayList<Tweet> returnedList = tweets.getTweets();

        assertEquals(tweetList, returnedList);

    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("And once again, another test case");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test first tweet");
        Tweet tweet2 = new NormalTweet("test second tweet");

        tweets.add(tweet);
        tweets.add(tweet2);

        assertEquals(tweets.getCount(), 2);
    }

    public void testStrings() {
        assertEquals("'test' should be 'test'", "test", "test");
        //Note: apparently using startsWith isn't good practice.
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }
}
