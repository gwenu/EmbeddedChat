package ag.embedded.chat.repositories;

public interface ChatRoomRepository {
	//extends MongoRepository<Message, String> {
	
	Long findChatRoomByActors(String sender, String receiver);

}
