package org.apache.struts.helloworld.model;

/**
 * Model class that stores a message.
 * 
 *
 */
public class MessageStore {
	
	private String message;
	
	public MessageStore() {
		
		setMessage("WSO2 AS :  Hello Struts User");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
