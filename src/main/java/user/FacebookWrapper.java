package user;

import facebook_api.FacebookUser;

public class FacebookWrapper implements User {
    private FacebookUser facebookUser;
    public FacebookWrapper(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail() {
        return facebookUser.getEmail();
    }

    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    public String getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
