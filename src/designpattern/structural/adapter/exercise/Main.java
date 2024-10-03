package designpattern.structural.adapter.exercise;

public class Main {
    public static void main(String[] args) {
        var client = new EmailClient();
        client.addProvider(new GmailAdapter());
        client.downloadEmails();
    }
}
