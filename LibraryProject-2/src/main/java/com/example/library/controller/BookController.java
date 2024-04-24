package com.example.library.controller;
import com.example.library.services.BookService;
import com.example.library.model.Book;
import com.example.library.services.BookRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	private final BookService bookService;
	
	@Autowired
	public BookController (BookService bookService) {
		this.bookService= bookService;
	}
	
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id) {
		return bookService.getBookById(id).orElseThrow();
		}
	
	@GetMapping("/latest")
    public ResponseEntity<?> getLatestPublishedBook() {
        Optional<Book> latestBook = bookService.getLatestPublishedBook();
        if (latestBook.isPresent()) 
        {
            return ResponseEntity.ok(latestBook.get());
        } 
        else {
            return ResponseEntity.notFound().build();
        }
	}
	@GetMapping("/first")
	public ResponseEntity<?> getFirstPublishedBook() {
	    Optional<Book> firstBook = bookService.getFirstPublishedBook();
	    if (firstBook.isPresent()) {
	        return ResponseEntity.ok(firstBook.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	@GetMapping("/second-to-latest")
	public ResponseEntity<?> getSecondToLatestPublishedBook() {
	    Optional<Book> secondToLatestBook = bookService.getSecondToLatestPublishedBook();
	    if (secondToLatestBook.isPresent()) {
	        return ResponseEntity.ok(secondToLatestBook.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	@GetMapping("/year/{year}")
    public ResponseEntity<?> getBooksByYear(@PathVariable String year) {
        List<Book> books = bookService.getBooksByYear(year);
        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(books);
        }
    }

}


