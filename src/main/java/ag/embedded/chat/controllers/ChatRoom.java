package ag.embedded.chat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ag.embedded.chat.services.ChatRoomService;

@RestController
public class ChatRoom {
	
	@Autowired
	private ChatRoomService chatRoomService;
	
	@RequestMapping("/chatroom/register")
	public Long registerChatRoom(String sender, String receiver) {
		return chatRoomService.getChatRoomId(sender, receiver);  
	}
}
