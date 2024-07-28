package com.jsp.agro.entity;
import java.util.List;

import com.jsp.agro.enums.UserType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message="you must write a First Name")
	@NotNull(message = "First name is mandatory")
	private String firstName;
	
	@NotBlank(message="you must write a Last Name")
	@NotNull(message = "Last name is mandatory")
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	private long phone;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", 
			message = "Password must be at least 8 characters long and contain at least one digit, one lowercase letter, one uppercase letter, one special character, and no whitespace")
	private String pwd;
	
	private String gender;
	
	@Enumerated(EnumType.STRING)
	private UserType type;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	 private Image image;
	
	@OneToMany(cascade = CascadeType.ALL)
	 private List<Post> userpost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public List<Post> getUserpost() {
		return userpost;
	}

	public void setUserpost(List<Post> userpost) {
		this.userpost = userpost;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", pwd=" + pwd + ", gender=" + gender + ", type=" + type + ", address=" + address
				+ ", image=" + image + ", userpost=" + userpost + "]";
	}

	public User(int id,
			@NotBlank(message = "you must write a First Name") @NotNull(message = "First name is mandatory") String firstName,
			@NotBlank(message = "you must write a Last Name") @NotNull(message = "Last name is mandatory") String lastName,
			String email, long phone,
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", message = "Password must be at least 8 characters long and contain at least one digit, one lowercase letter, one uppercase letter, one special character, and no whitespace") String pwd,
			String gender, UserType type, Address address, Image image, List<Post> userpost) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.gender = gender;
		this.type = type;
		this.address = address;
		this.image = image;
		this.userpost = userpost;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
