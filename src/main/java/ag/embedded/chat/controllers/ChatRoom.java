package ag.embedded.chat.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRoom {
	
	@RequestMapping("/chatroom/register")
	public Long registerChatRoom(String sender, String receiver) {
		return (long) new Random().nextInt();   // TODO: Chat room service, validation, User input parms
	}
}
