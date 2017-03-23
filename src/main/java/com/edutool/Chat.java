package com.edutool;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by vashanin on 23/03/17.
 */

public class Chat {
    private String topic;

    private Set<User> participants;
    private List<Message> messages;

    private List<Message> loadMessages() {
        return new ArrayList<Message>();
    }

    public Chat(String topic, Set<User> participants) {
        this.topic = topic;
        this.participants = participants;
        this.messages = loadMessages();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void addParticipant(User user) {
        participants.add(user);
    }

    public void removeParticipant(User user) {
        participants.remove(user);
    }
}
