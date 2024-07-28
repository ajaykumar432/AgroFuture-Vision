package com.jsp.agro.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
    @Lob
    @Column(length = 100000000)
	private byte [] data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", data=" + Arrays.toString(data) + "]";
	}
	public Image(int id, String name, byte[] data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
