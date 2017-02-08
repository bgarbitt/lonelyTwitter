package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * Created by brettgarbitt on 2017-01-17.
 */
// The classes that use this interface must use getMessage and getDate.
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();
=======

import java.util.Date;

public interface Tweetable {
    public String getMessage();

    public Date getDate();

>>>>>>> elasticsearch
}
