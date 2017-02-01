package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */
public class Happy extends Mood {

    /**
     * This will indicate a happy tweet
     *
     * @param mood current mood of tweet
     * @param date date the user wants to show
     */
    public Happy(String mood, Date date) {
        super(mood, date);
    }

    /**
     * This will indicate a happy tweet
     *
     * @param mood current mood of tweet
     */
    public Happy(String mood) {
        super(mood);
    }

    /**
     * will get the mood and add a smiley face to it
     * @return the tweet with a smiley face
     */
    @Override
    public String getMood() {
        return super.getMood() + " :)";
    }
}
