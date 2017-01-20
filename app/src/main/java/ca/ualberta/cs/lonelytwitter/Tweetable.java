package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */

// The classes that use this interface must use getMessage and getDate.
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
