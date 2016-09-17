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
        return new Message(message.getSender(), message.getReceiver(), new Date(), message.getMessage());
    }
}
