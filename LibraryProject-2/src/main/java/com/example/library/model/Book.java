package com.example.library.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String bookname;
private String author;
public String year_publication;

public Book() {
	
}

public Book(String bookname, String author, String year_publication) {
	this.bookname=bookname;
	this.author=author;
	this.year_publication=year_publication;
}

public String getAuthor() {
	return author;
}

public String getBookname() {
	return bookname;
}

public int getId() {
	return id;
}

@Column(nullable = false)
public String getYear_publication() {
	return year_publication;
}

public void setAuthor(String author) {
	this.author = author;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}
public void setId(int id) {
	this.id = id;
}

public void setYear_publication(String year_publication) {
	this.year_publication = year_publication;
}
}

