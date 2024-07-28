package com.jsp.agro.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private String msg;
	private int status;
	private T data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseStructure [msg=" + msg + ", status=" + status + ", data=" + data + "]";
	}
	public ResponseStructure(String msg, int status, T data) {
		super();
		this.msg = msg;
		this.status = status;
		this.data = data;
	}
	public ResponseStructure() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
