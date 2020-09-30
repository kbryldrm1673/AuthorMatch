package com.spring.boot.dao.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.dao.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

	@Query(value = "select max(author_id) from author", nativeQuery = true)
	public Long findMaxId();

}
