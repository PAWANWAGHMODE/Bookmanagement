package com.tka.BookManagementSyatemJPA.Repo;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.BookManagementSyatemJPA.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

  



Optional<Book> findBookByBookname(String bookname);
Optional<Book>  deleteBookByBookname(String bookname);
}
