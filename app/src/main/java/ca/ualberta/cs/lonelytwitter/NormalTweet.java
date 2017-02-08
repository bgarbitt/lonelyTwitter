package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

=======
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
>>>>>>> elasticsearch
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
