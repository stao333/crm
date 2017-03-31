package com.crm.web.model;

import java.time.LocalDate;
import java.util.Date;

public class JsonActivity
{
	private Integer activityId;
	private String activityType;
	private Integer contactId;
	private String contactName;
	private String title;
	private String notes;
	private LocalDate dueDate;

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId( Integer activityId ) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType( String activityType ) {
		this.activityType = activityType;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId( Integer contactId ) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName( String contactName ) {
		this.contactName = contactName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes( String notes ) {
		this.notes = notes;
	}

	public Date getDueDate() {
		Date date = java.sql.Date.valueOf( dueDate );
		return date;
	}

	public void setDueDate( LocalDate dueDate ) {
		this.dueDate = dueDate;
	}

}
