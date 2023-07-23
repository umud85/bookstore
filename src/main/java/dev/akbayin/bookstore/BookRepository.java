package dev.akbayin.bookstore;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface BookRepository extends MongoRepository<Book, ObjectId> {
}
