package com.jsp.agro.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "UserPost")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int likes;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comment> comment;
	
	@OneToOne(cascade = CascadeType.ALL)
	 private Image image;
	
	private String date;
	private String caption;
	private String Location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", likes=" + likes + ", comment=" + comment + ", image=" + image + ", date=" + date
				+ ", caption=" + caption + ", Location=" + Location + "]";
	}
	public Post(int id, int likes, List<Comment> comment, Image image, String date, String caption, String location) {
		super();
		this.id = id;
		this.likes = likes;
		this.comment = comment;
		this.image = image;
		this.date = date;
		this.caption = caption;
		Location = location;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
