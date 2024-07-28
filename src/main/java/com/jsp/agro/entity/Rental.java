package com.jsp.agro.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Rental {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date startTime;
	private Date  endTime;
	
	@ManyToOne
	private Equipments equipment;
	
	@OneToOne
	private PaymentHistory paymentHistory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Equipments getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipments equipment) {
		this.equipment = equipment;
	}

	public PaymentHistory getPaymentHistory() {
		return paymentHistory;
	}

	public void setPaymentHistory(PaymentHistory paymentHistory) {
		this.paymentHistory = paymentHistory;
	}

	@Override
	public String toString() {
		return "Rental [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", equipment=" + equipment
				+ ", paymentHistory=" + paymentHistory + "]";
	}

	public Rental(int id, Date startTime, Date endTime, Equipments equipment, PaymentHistory paymentHistory) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.equipment = equipment;
		this.paymentHistory = paymentHistory;
	}

	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
