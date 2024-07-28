package com.jsp.agro.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class PaymentHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String mode;
	private LocalDateTime paymentTime;
	private double amount;
	
	@ManyToOne
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDateTime getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(LocalDateTime paymentTime) {
		this.paymentTime = paymentTime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PaymentHistory [id=" + id + ", mode=" + mode + ", paymentTime=" + paymentTime + ", amount=" + amount
				+ ", user=" + user + "]";
	}

	public PaymentHistory(int id, String mode, LocalDateTime paymentTime, double amount, User user) {
		super();
		this.id = id;
		this.mode = mode;
		this.paymentTime = paymentTime;
		this.amount = amount;
		this.user = user;
	}

	public PaymentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
