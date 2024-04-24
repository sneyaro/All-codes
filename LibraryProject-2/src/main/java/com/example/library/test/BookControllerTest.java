package com.example.library.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.library.services.BookService;
import com.example.library.model.*;
import com.example.library.controller.BookController;

import java.util.Arrays;
import java.util.List;

public class BookControllerTest {

    private BookService bookService;
    private BookController bookController;

    @BeforeEach
    public void setUp() {
        bookService = Mockito.mock(BookService.class);
        bookController = new BookController(bookService);
    }

    @Test
    public void testGetAllBooks() {
       
        List<Book> books = Arrays.asList(
            new Book("Book1", "Author1", "2022"),
            new Book("Book2", "Author2", "2023")
        );
        when(bookService.getAllBooks()).thenReturn(books);

       
        List<Book> result = bookController.getAllBooks();

    
        assertEquals(2, result.size());
        assertEquals("Book1", result.get(0).getBookname());
        assertEquals("Book2", result.get(1).getBookname());
    }

   
}
