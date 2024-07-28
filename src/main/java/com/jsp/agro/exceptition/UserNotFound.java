package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserNotFound extends RuntimeException {
	private String msg = "not found";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "UserNotFound [msg=" + msg + "]";
	}

	public UserNotFound(String msg) {
		super();
		this.msg = msg;
	}

	public UserNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
