package org.carlof.contactmanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

	private String name;
	private String address;
	private String telephone;
	
	private String note;
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
