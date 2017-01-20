package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */

public abstract class Mood {
    public String mood;
    public Date date;

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
