package designpattern.structural.adapter.exercise;

import designpattern.structural.adapter.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
