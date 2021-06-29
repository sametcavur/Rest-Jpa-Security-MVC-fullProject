package com.project.api;

public class CustomerErrorResponse {
	private int status;
	private String messages;
	private long time;
	public CustomerErrorResponse() {
	}
	public CustomerErrorResponse(int status, String messages, long time) {
		this.status = status;
		this.messages = messages;
		this.time = time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}

}
