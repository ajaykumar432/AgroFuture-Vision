package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PasswordMissmatched extends RuntimeException {
	private String msg = "password is incorrect";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PasswordMissmatched [msg=" + msg + "]";
	}

	public PasswordMissmatched(String msg) {
		super();
		this.msg = msg;
	}

	public PasswordMissmatched() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PasswordMissmatched(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PasswordMissmatched(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PasswordMissmatched(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	

}
