package com.navinmathew.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.navinmathew.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
