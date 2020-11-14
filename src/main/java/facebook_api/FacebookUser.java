package facebook_api;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private String userActiveTime;
}
