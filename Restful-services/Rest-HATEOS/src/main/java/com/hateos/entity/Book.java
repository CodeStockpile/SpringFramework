package com.hateos.entity;

import org.springframework.hateoas.RepresentationModel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book extends RepresentationModel<Book>{
	
	
	private int isbn;
	
	@XmlElement(name="Book-name")
	private String name;
	
	private String author;
	
	/* this value will be passed as attribute in Book tag */
//	@XmlAttribute
//	private String publisher;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String name, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
