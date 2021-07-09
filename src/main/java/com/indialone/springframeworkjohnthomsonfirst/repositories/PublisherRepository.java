package com.indialone.springframeworkjohnthomsonfirst.repositories;

import com.indialone.springframeworkjohnthomsonfirst.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {
}
