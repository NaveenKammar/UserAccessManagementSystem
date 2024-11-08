package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Request {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User user;
    
    @ManyToOne
    private Software software;
    
    private String accessType; // Read, Write, Admin
    private String reason;
    private String status;
	public Request(Long id, User user, Software software, String accessType, String reason, String status) {
		super();
		this.id = id;
		this.user = user;
		this.software = software;
		this.accessType = accessType;
		this.reason = reason;
		this.status = status;
	}
	public Request() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Software getSoftware() {
		return software;
	}
	public void setSoftware(Software software) {
		this.software = software;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", user=" + user + ", software=" + software + ", accessType=" + accessType
				+ ", reason=" + reason + ", status=" + status + "]";
	}
    
}
