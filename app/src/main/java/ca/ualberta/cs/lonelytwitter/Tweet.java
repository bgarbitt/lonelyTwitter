package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 * <p>
 * Tweet class is a super class that implements Tweetable
 */
// classes can only have one parent, but can have multiple interfaces
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    /**
     * The Array list.
     */
    public ArrayList<Mood> arrayList = new ArrayList<Mood>();

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    /**
     * Add happy mood.
     *
     * @param message the message
     * @param date    the date
     */
    public void addHappyMood(String message, Date date) {
        Mood mood = new Happy(message, date);
        arrayList.add(mood);
    }

    /**
     * Add sad mood.
     *
     * @param message the message
     * @param date    the date
     */
    public void addSadMood(String message, Date date) {
        Mood mood = new Sad(message, date);
        arrayList.add(mood);
    }

    /**
     * Add happy mood.
     *
     * @param message the message
     */
    public void addHappyMood(String message) {
        Mood mood = new Happy(message);
        arrayList.add(mood);
    }

    /**
     * Add sad mood.
     *
     * @param message the message
     */
    public void addSadMood(String message) {
        Mood mood = new Sad(message);
        arrayList.add(mood);
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
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
