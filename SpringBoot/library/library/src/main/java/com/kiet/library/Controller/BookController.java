
package com.kiet.library.controller;

import com.kiet.library.model.Book;
import com.kiet.library.service.BookService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<?> getBookById(
            @PathVariable int bookId) {

        Book book = bookService.getBookById(bookId);

        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<String> addBook(
            @RequestBody Book book) {

        String message = bookService.addBook(book);

        if (message.equals("Book ID already exists")) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(message);
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(message);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<String> updateBook(
            @PathVariable int bookId,
            @RequestBody Book updatedBook) {

        String message =
                bookService.updateBook(bookId, updatedBook);

        if (message.equals("Book not found")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(message);
        }

        return ResponseEntity.ok(message);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(
            @PathVariable int bookId) {

        String message = bookService.deleteBook(bookId);

        if (message.equals("Book not found")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(message);
        }

        return ResponseEntity.ok(message);
    }

    @GetMapping("/search")
    public List<Book> searchByCategory(
            @RequestParam String category) {

        return bookService.searchByCategory(category);
    }

    @GetMapping("/published")
    public List<Book> findPublishedFromYear(
            @RequestParam int fromYear) {

        return bookService.findPublishedFromYear(fromYear);
    }
}
