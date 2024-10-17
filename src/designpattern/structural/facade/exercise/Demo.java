package designpattern.structural.facade.exercise;

public class Demo {
    public static void main(String[] args) {
        var twitterAPI = new TwitterAPI("appKey", "secret");
        var tweets = twitterAPI.getRecentTweets();
    }
}
