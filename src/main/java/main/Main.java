package main;

import facebook_api.FacebookUser;
import senders.MessageSender;
import twitter_api.TwitterUser;
import user.FacebookWrapper;
import user.TwitterWrapper;
import user.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User twUser = new TwitterWrapper(new TwitterUser("valyavka@ucu.edu.ua", "Ukraine", "12 nov"));
        User fbUser = new FacebookWrapper(new FacebookUser("valyavka@ucu.edu.ua", "Ukraine", "12 nov"));
        List<User> users = Arrays.asList(twUser, fbUser);
    }
}
