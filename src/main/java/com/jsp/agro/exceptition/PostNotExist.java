package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostNotExist extends RuntimeException {
	private String msg = "not found";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PostNotExist [msg=" + msg + "]";
	}

	public PostNotExist(String msg) {
		super();
		this.msg = msg;
	}

	public PostNotExist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PostNotExist(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PostNotExist(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
