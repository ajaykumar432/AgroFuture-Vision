package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataNotUpdate extends RuntimeException {

	private String msg = "not found";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DataNotUpdate [msg=" + msg + "]";
	}

	public DataNotUpdate(String msg) {
		super();
		this.msg = msg;
	}

	public DataNotUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataNotUpdate(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DataNotUpdate(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataNotUpdate(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	 
}
