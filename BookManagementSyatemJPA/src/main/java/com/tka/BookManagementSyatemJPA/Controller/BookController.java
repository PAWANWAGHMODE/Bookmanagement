package com.tka.BookManagementSyatemJPA.Controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.BookManagementSyatemJPA.Entity.Book;
import com.tka.BookManagementSyatemJPA.Service.BookService;
@RestController
public class BookController {
 @Autowired
 BookService bookservice;
 
  @PostMapping("/add")
	public Book addbook(@RequestBody Book book) {
		return bookservice.addbook(book);
	}
  @PostMapping("addbook")
  public void add(@RequestBody Book book) {
		bookservice.add(book);
	}
  @DeleteMapping("deletebook")
  public void deletebook(@RequestBody Book book) {
		bookservice.deletebook(book);
	}
  @DeleteMapping("deletebookbyid/{id}")
  public void deletebookbyid(@PathVariable int id) {
		bookservice.deletebookbyid(id);
	}
  @PutMapping("updatebook")
  public void updatebook(@RequestBody Book book) {
	bookservice.updatebook(book);
		}
  @PutMapping("updatebookbyid/{id}")
  public Book updatebookr(@PathVariable int id,@RequestBody Book book) {
	  return bookservice.updatebookr(id, book);
  }
  @GetMapping("getallbooks")
  public List<Book> findall() {
		return bookservice.findall();
	}
  @GetMapping("getbyidusingpathvariable/{id}")
  public Book getbyid(@PathVariable int id) {
		return bookservice.getbyid(id);
  }
 
@GetMapping("getbyname/{bookname}")
  public Optional<Book> getBooksByName(@PathVariable String bookname){
		return bookservice.getBooksByName(bookname);
	}
@DeleteMapping("deletebooksbybookname/{bookname}")
public Optional<Book> deleteBookByBookname( @PathVariable String bookname) {
	return  bookservice.deleteBookByBookname(bookname);
}
}