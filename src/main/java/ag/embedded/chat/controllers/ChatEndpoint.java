package ag.embedded.chat.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import ag.embedded.chat.models.Message;
import ag.embedded.chat.services.ChatRoomService;

@RestController
public class ChatEndpoint {
	
	@Autowired
	private ChatRoomService chatRoomService;
	
	@MessageMapping("/message")
    @SendTo("/chatter/endpoint")
    public Message greeting(Message message) throws Exception {
//		Long chatRoomId = chatRoomService.getChatRoomId(message.getSender(), message.getSender());
	
        return new Message(message.getSender(), message.getChatRoomId(), new Date(), message.getMessage());
    }
}
