package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */

public class Sad extends Mood {
    public Sad(String mood, Date date) {
        super(mood, date);
    }

    public Sad(String mood) {
        super(mood);
    }

    @Override
    public String getMood() {
        return super.getMood() + ":(";
    }
}
