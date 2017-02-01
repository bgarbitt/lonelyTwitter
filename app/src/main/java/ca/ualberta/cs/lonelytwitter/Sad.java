package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */
public class Sad extends Mood {
    /**
     * Instantiates a new Sad.
     *
     * @param mood the mood
     * @param date the date
     */
    public Sad(String mood, Date date) {
        super(mood, date);
    }

    /**
     * Instantiates a new Sad.
     *
     * @param mood the mood
     */
    public Sad(String mood) {
        super(mood);
    }

    @Override
    public String getMood() {
        return super.getMood() + ":(";
    }
}
