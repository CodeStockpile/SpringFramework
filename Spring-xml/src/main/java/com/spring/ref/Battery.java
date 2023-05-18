package com.spring.ref;

public class Battery {

	private String id;

	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Battery(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Battery [id=" + id + "]";
	}
	
}
