package com.projectengage.repository;

import org.springframework.data.repository.CrudRepository;
import com.projectengage.model.Books;
import org.springframework.stereotype.Repository;

//repository that extends CrudRepository
@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}