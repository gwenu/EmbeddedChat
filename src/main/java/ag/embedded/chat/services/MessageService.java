package ag.embedded.chat.services;

import java.util.List;

import ag.embedded.chat.models.Message;

public interface MessageService {

	public Message getMessageById(Long id);
	public Message saveMessage(Message message);
	public Message deleteMessage(Long id);
	public List<Message> getAllMessages();
}
