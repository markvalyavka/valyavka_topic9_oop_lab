package senders;

import user.User;

import java.util.List;

public class MessageSender {
    public void sendMessage(User user, String text, String country) {
        if (user.getCountry().equals(country)) {
            System.out.println(text + " send to " + user.getEmail());
        }
    }
}
