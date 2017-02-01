package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */

public abstract class Mood {
    public String mood;
    public Date date;

    /**
     * Will set mood to whatever you want
     * @param mood happy or sad
     * @param date date inputted
     */
    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * Will set mood to whatever you want
     * @param mood happy or sad
     */
    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    /**
     * will get current mood of tweet
     * @return current mood of tweet
     */
    public String getMood() {
        return mood;
    }

    /**
     * will set mood of tweet
     * @param mood happy or sad
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * will get date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * will set date
     * @param date date inputted
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
