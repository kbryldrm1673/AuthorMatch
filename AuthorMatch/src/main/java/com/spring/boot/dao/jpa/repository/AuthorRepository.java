package com.spring.boot.dao.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.spring.boot.dao.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

	@Query(value = "select max(article_id) from article", nativeQuery = true)
	public Long findMaxId();

}
