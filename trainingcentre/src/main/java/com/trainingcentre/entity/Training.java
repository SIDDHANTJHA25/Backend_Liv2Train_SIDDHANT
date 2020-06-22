package com.trainingcentre.entity;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Training {
    
	//Validation of Centername
	@Id
	@Column(length=39)
	@Size(max=39,message="The center name length should smaller then 40 ")
	private String centername;
	
	//Validation of Centercode
	@Column(length=12)
	@Size(min=12,message="Exactly 12 Characters should be present in centercode")
	private String centercode;
	private Address address;
	private int studentcapacity;
	
	//Creating course table with foreign key
	@ElementCollection
	@CollectionTable(name = "courses", joinColumns = @JoinColumn(name = "center_name"))
	@Column(name = "course_offered")
	private List<String> courseOffered;	
	
	
	private long createdon;
	
	
	
	
	//validation for email
	@Column(unique=true)
	@Pattern(regexp="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])",message="Enter valid email")
	private String contactemail;
	
	//validation for Phone no
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})",message="Phone number should be valid")
	private String contactphone;
	
	
	public Training() {
		
	}
	public Training(String centername,String centercode,Address address,int studentcapacity,List<String> courseOffered,long createdon,String contactemail,String contactphone) {
		super();
		this.centername= centername;
		this.centercode= centercode;
		this.address=address;
		this.studentcapacity=studentcapacity;
		this.courseOffered=courseOffered;	
		this.createdon=createdon;
		this.contactemail=contactemail;
		this.contactphone=contactphone;
	}
	
	
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getCentercode() {
		return centercode;
	}
	public void setCentercode(String centercode) {
		this.centercode = centercode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStudentcapacity() {
		return studentcapacity;
	}
	public void setStudentcapacity(int studentcapacity) {
		this.studentcapacity = studentcapacity;
	}
	public List<String> getCourseOffered() {
		return courseOffered;
	}
	public void setCourseOffered(List<String> courseOffered) {
		this.courseOffered = courseOffered;
	}
	public long getCreatedon() {
		return createdon;
	}
	public void setCreatedon(long createdon) {
		this.createdon = createdon;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public String getContactphone() {
		return contactphone;
	}
	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}
}
