package com.edutool;

import java.util.Date;

/**
 * Created by vashanin on 23/03/17.
 */

public class Message {
    private User sender;
    private Date date;
    private String content;

    public Message(User sender, String content) {
        this.sender = sender;
        this.date = new Date();
        this.content = content;
    }
}
