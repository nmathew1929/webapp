package com.navinmathew.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.navinmathew.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
