package ag.embedded.chat.models;

import java.util.Date;

public class Message {

	private String sender;
	private String receiver;
	private Date date;
	private String message;
	
	public Message() { }
	
	public Message(String sender, String receiver, Date date, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.date = date;
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
