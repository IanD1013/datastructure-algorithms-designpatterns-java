package designpattern.structural.facade.exercise;

import java.util.List;

/**
 * We are building a social media management tool. On a few screens, we
 * need to display the recent tweets of a given user. Below are the steps
 * required to talk to the Twitter API.
 *
 * - We need to get a request token first.
 * - We'll then exchange the request token with an access token.
 * - To get the recent tweets, we need to send the access token to Twitter API
 *
 * We have to repeat similar steps for other operations such as composing a
 * new tweet, liking a tweet, etc.
 */

public class TwitterAPI {
    private String appKey;
    private String secret;

    public TwitterAPI(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());

        return tweets;
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        return accessToken;
    }
}

