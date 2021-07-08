package com.indialone.springframeworkjohnthomsonfirst.repositories;

import com.indialone.springframeworkjohnthomsonfirst.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
