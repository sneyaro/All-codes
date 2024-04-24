package com.example.library.services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	Book save(BookService book);

}
