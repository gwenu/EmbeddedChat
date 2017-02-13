package ag.embedded.chat.services.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ag.embedded.chat.repositories.ChatRoomRepository;
import ag.embedded.chat.services.ChatRoomService;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {
	
//	@Autowired
//	private ChatRoomRepository chatRoomRepository;

	@Override
	public Long getChatRoomId(String sender, String receiver) {
//		Long chatRoomId = chatRoomRepository.findChatRoomByActors(sender, receiver);
//		return chatRoomId != null ? chatRoomId : (long) new Random().nextInt();
		
		return (long) new Random().nextInt();
	}
}
