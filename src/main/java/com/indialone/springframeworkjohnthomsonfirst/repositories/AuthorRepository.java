package com.indialone.springframeworkjohnthomsonfirst.repositories;

import com.indialone.springframeworkjohnthomsonfirst.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
