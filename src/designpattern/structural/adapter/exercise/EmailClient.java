package designpattern.structural.adapter.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * We're building an email client like Outlook. Our client should
 * be able to connect to different mail servers such as Gmail,
 * Yahoo, etc.
 *
 * You can see an interface called EmailProvider. Our EmailClient
 * class talks to this interface so it's not coupled to a particular
 * mail service.
 *
 * Here is the problem: In the Gmail package, you can find the class
 * that Google provides to connect to Gmail. These classes are shipped
 * as a 3rd party library that we can add to our application. We want
 * to re-use these classes but the GmailClient class does not extend
 * our EmailProvider interface.
 *
 * Use the adapter pattern to convert the interface of GmailClient
 */

public class EmailClient {
    private List<EmailProvider> providers = new ArrayList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
