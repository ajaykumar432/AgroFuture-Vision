package com.jsp.agro.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Equipments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String equipName;
	private double costOfEquipement;
	private int quantity;
	
	@ManyToOne
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public double getCostOfEquipement() {
		return costOfEquipement;
	}

	public void setCostOfEquipement(double costOfEquipement) {
		this.costOfEquipement = costOfEquipement;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Equipments [id=" + id + ", equipName=" + equipName + ", costOfEquipement=" + costOfEquipement
				+ ", quantity=" + quantity + ", user=" + user + "]";
	}

	public Equipments(int id, String equipName, double costOfEquipement, int quantity, User user) {
		super();
		this.id = id;
		this.equipName = equipName;
		this.costOfEquipement = costOfEquipement;
		this.quantity = quantity;
		this.user = user;
	}

	public Equipments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
