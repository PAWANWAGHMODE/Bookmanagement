package com.tka.BookManagementSyatemJPA.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.BookManagementSyatemJPA.Entity.Book;
import com.tka.BookManagementSyatemJPA.Repo.BookRepository;

import jakarta.persistence.Id;
@ Service
public class BookService {
@Autowired
BookRepository bookrepo;
	
	public Book addbook(Book book) {
		Book Book=bookrepo.save(book);
		return Book;
	}
	public void deletebook(Book book) {
		bookrepo.delete(book);
		
	}
	public void add(Book book) {
		Book Book=bookrepo.save(book);
	}
	
	public void updatebook(Book book) {
	 Book Book=bookrepo.save(book);
	}
	public Book updatebookr(int id,Book book) {
		Book bb=bookrepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		bb.setBookname(book.getBookname());
		bb.setAuthor(book.getAuthor());
		bb.setPrice(book.getPrice());
		return bookrepo.save(bb);
	}
	public List<Book> findall() {
		return bookrepo.findAll();
	}
	public Book getbyid(int id) {
		return bookrepo.findById(id).orElse(null);
	}
	public void deletebookbyid(int id) {
		bookrepo.deleteById(id);
	}
	public Optional<Book> getBooksByName(String bookname){
		return bookrepo.findBookByBookname(bookname);
	}
	 public Optional<Book> deleteBookByBookname(String bookname) {
		return  bookrepo.deleteBookByBookname(bookname);
	 }
 

}
