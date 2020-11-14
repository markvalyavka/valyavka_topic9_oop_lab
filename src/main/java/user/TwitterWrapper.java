package user;

import twitter_api.TwitterUser;

public class TwitterWrapper implements User {
    private TwitterUser twitterUser;
    public TwitterWrapper(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return twitterUser.getUserMail();
    }

    public String getCountry() {
        return twitterUser.getCountry();
    }

    public String getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
