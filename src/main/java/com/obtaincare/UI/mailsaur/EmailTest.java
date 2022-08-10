package com.obtaincare.UI.mailsaur;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.SearchCriteria;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class EmailTest {

    public String apiKey = "sHmOqpwyCKD11mjb";
    public String serverId = "l8odhxta";
    public String domain = "l8odhxta.mailosaur.net";

    @Test
    public void testEmail() throws MailosaurException, IOException {

        MailosaurClient mailosaurClient = new MailosaurClient(apiKey);

        SearchCriteria searchCriteria = new SearchCriteria();

        searchCriteria.withSentFrom("musakunovnur@gmail.com");
        searchCriteria.withSubject("This is test");

        Message message = mailosaurClient.messages().get(serverId,searchCriteria);

        System.out.println("The Subject is: " + message.subject());
        System.out.println("The content is: " + message.text().body());
    }
}
