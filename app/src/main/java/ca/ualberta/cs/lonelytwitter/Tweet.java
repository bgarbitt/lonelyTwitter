package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */

// classes can only have one parent, but can have multiple interfaces
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    public ArrayList<Mood> arrayList = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    public void addHappyMood(String message, Date date) {
        Mood mood = new Happy(message, date);
        arrayList.add(mood);
    }

    public void addSadMood(String message, Date date) {
        Mood mood = new Sad(message, date);
        arrayList.add(mood);
    }

    public void addHappyMood(String message) {
        Mood mood = new Happy(message);
        arrayList.add(mood);
    }

    public void addSadMood(String message) {
        Mood mood = new Sad(message);
        arrayList.add(mood);
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            // todo new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
