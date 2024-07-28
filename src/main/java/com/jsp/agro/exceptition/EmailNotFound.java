package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class EmailNotFound extends RuntimeException{
	private String msg = "not found";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "EmailNotFound [msg=" + msg + "]";
	}

	public EmailNotFound(String msg) {
		super();
		this.msg = msg;
	}

	public EmailNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmailNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmailNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
