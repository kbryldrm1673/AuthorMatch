package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.dao.entity.Article;
import com.spring.boot.dao.entity.Author;
import com.spring.boot.dao.jpa.repository.ArticleRepository;
import com.spring.boot.dao.jpa.repository.AuthorRepository;
import com.spring.boot.service.model.AuthorContext;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private ArticleRepository articleRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(AuthorContext authorContext) {
		Long maxId = authorRepository.findMaxId() + 1;
		Author x = new Author();
		Article y = new Article();
		x.setAuthorId(maxId);
		x.setAuthorName(authorContext.getAuthorName());
		x = authorRepository.save(x);
		y.setArticleContent(authorContext.getArticleContext());
		y = articleRepository.save(y);
	}
}
