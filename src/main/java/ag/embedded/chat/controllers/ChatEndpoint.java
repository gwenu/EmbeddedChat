package ag.embedded.chat.controllers;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import ag.embedded.chat.models.Message;

@Controller
public class ChatEndpoint {
	
	@MessageMapping("/message")
    @SendTo("/chat/endpoint")
    public Message greeting(Message message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new Message("Sender", "Receiver", new Date(), "New Message");
    }
}
