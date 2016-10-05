package ag.embedded.chat.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ag.embedded.chat.models.Message;

public interface MessageRepository {
//extends MongoRepository<Message, String> {

    public Message findById(Long id);
    public List<Message> findByChatRoomId(Long chatRoomId);

} 