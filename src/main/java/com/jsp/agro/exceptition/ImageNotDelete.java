package com.jsp.agro.exceptition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ImageNotDelete extends RuntimeException {
	private String msg = "not found";

	public String getMsg1() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ImageNotDelete(String msg) {
		super();
		this.msg = msg;
	}

	public ImageNotDelete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImageNotDelete(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ImageNotDelete(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ImageNotDelete(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ImageNotDelete [msg=" + msg + "]";
	}

	public String getMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
