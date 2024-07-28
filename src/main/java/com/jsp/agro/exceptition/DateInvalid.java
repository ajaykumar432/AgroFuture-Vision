package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DateInvalid extends RuntimeException {
	private String msg = "Date invalid";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DateInvalid [msg=" + msg + "]";
	}

	public DateInvalid(String msg) {
		super();
		this.msg = msg;
	}

	public DateInvalid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DateInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DateInvalid(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DateInvalid(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
