package com.example.demo;
import javax.persistence.*;

@Entity
@Table(name = "checkuser")
public class checkoutusers {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
	@Column(nullable = false, unique = true, length = 45)
    private String email;
	
	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	@Column(name="last_name",nullable=false,length=20)
	private String lastName;
	@Column(name="mobile",nullable=false,length=10)
	private String Mobile;
	@Column(name="country",nullable=false,length=10)
	private String Country;
	@Column(name="city",nullable=false,length=10)
	private String City;
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
}