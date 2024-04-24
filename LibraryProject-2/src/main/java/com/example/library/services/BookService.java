package com.example.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.services.BookRepository;
import com.example.library.controller.BookController;
import com.example.library.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;
@Service
public class BookService {
	
	private final BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	public List<Book> getAllBooks() {
	    return bookRepository.findAll();
	}

	public Optional<Book> getBookById(Integer id) {
	    return bookRepository.findById(id);
	}

	public Book saveBook(Book book) {
	    return bookRepository.save(book);
	}

	public void deleteBook(Integer id) {
	    bookRepository.deleteById(id);
	}
	public List<Book> getBooksByYear(String year) {
        List<Book> allBooks = bookRepository.findAll();
        return allBooks.stream()
                .filter(book -> book.getYear_publication() == year)
                .collect(Collectors.toList());
    }

    public Optional<Book> getLatestPublishedBook() {
        List<Book> allBooks = bookRepository.findAll();
        if (allBooks.isEmpty()) {
            return Optional.empty();
        }
        allBooks.sort(Comparator.comparing(Book::getYear_publication).reversed());
        String latestYear = allBooks.get(0).getYear_publication();
        return Optional.of(allBooks.get(0));
    }

    public Optional<Book> getSecondToLatestPublishedBook() {
        List<Book> allBooks = bookRepository.findAll();
        if (allBooks.size() < 2) {
            return Optional.empty();
        }
        allBooks.sort(Comparator.comparing(Book::getYear_publication).reversed());
        String secondToLatestYear = allBooks.get(1).getYear_publication();
        return Optional.of(allBooks.get(1));
    }

    public Optional<Book> getFirstPublishedBook() {
        List<Book> allBooks = bookRepository.findAll();
        if (allBooks.isEmpty()) {
            return Optional.empty();
        }
        allBooks.sort(Comparator.comparing(Book::getYear_publication));
        String firstYear = allBooks.get(0).getYear_publication();
        return Optional.of(allBooks.get(0));
    }
}
	
