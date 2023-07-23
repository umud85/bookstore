package dev.akbayin.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping(value="/books", produces={"application/json"})
    public ResponseEntity<Collection<Book>> getBooks() {
        Collection<Book> books = repository.findAll();
        return ResponseEntity.ok().body(books);
    }


}
