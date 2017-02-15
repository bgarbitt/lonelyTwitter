/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
/**
 * Created by brettgarbitt on 2017-02-14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }else{
            tweets.add(tweet);
        }

    };

    public boolean hasTweet (Tweet tweet){
        return tweets.contains(tweet);

    }
    public void delete (Tweet tweet){
        tweets.remove(tweet);

    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
    public int getCount() {
        return tweets.size();
    }

}

