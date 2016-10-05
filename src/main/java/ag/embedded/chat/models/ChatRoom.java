package ag.embedded.chat.models;

import java.util.List;

public class ChatRoom {
	
	private Long id;
	private List<User> users;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
