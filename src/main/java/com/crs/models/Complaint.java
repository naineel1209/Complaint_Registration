package com.crs.models;

import java.sql.Date;

public class Complaint {
	private int id;
	private String title;
	private String text;
	private int userId;
	private String status;
	private Date date;

	public Complaint(int id, String title, String text, int userId, String status, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.userId = userId;
		this.status = status;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
