package com.gl.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	int id;
	String title;
	String description;
	String content;
	LocalDate createdDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String TicketTitle) {
		this.title = TicketTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String TicketShortDescription) {
		this.description = TicketShortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String Content) {
		this.content = Content;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate TicketCreatedOn) {
		this.createdDate = TicketCreatedOn;
	}
	public TicketDetails(String TicketTitle, String TicketShortDescription, LocalDate TicketCreatedOn) {
		super();
		this.title = TicketTitle;
		this.description = TicketShortDescription;
		this.createdDate = TicketCreatedOn;
	}
	public TicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}




