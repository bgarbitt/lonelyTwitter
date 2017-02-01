package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */
public class ImportantTweet extends Tweet {
    /**
     * Is how the tweet is considered an important tweet
     *
     * @param date    the date of the tweet
     * @param message the tweet text
     * @throws TweetTooLongException when tweet is too long
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Is how the tweet is considered an important tweet
     *
     * @param message the tweet text
     * @throws TweetTooLongException when tweet is too long
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * Makes the tweet important when called
     * @return True of False
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * will get the tweet and add exclamation marks for importance
     * @return tweet with exclamation marks added to it
     */
    @Override
    public String getMessage() {
        return super.getMessage() + "!!!!!";
    }
}
