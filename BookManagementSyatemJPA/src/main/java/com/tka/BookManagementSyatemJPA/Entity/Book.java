package com.tka.BookManagementSyatemJPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="book")
public class Book {
@Id
private int id;
private String bookname;
private String author;
private String price;

public Book() {
	super();
}


public Book(String bookname,String author,String price) {
	super();
	this.bookname = bookname;
	this.author=author;
	this.price=price;
}


public Book(int id, String bookname,String author,String price) {
	super();
	this.id = id;
	this.bookname = bookname;
	this.author=author;
	this.price=price;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getBookname() {
	return bookname;
}


public void setBookname(String bookname) {
	this.bookname = bookname;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public String getPrice() {
	return price;
}


public void setPrice(String price) {
	this.price = price;
}


@Override
public String toString() {
	return "Book [id=" + id + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
}





}
