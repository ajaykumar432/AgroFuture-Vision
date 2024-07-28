package com.jsp.agro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDetail {
	private String recipient;
    private String msgBody;
    private String subject;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "UserDetail [recipient=" + recipient + ", msgBody=" + msgBody + ", subject=" + subject + "]";
	}
	public UserDetail(String recipient, String msgBody, String subject) {
		super();
		this.recipient = recipient;
		this.msgBody = msgBody;
		this.subject = subject;
	}
	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
