package com.spring.boot.service.model;

import com.spring.boot.dao.entity.Author;

public class AuthorContext {

	private Long authorId;
	private String authorName;
	private String articleContext;
	private Long articleId;
	private Author author;

	public AuthorContext() {

	}

	public AuthorContext(Long authorId, String authorName, String articleContext, Long articleId, Author author) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.articleContext = articleContext;
		this.articleId = articleId;
		this.author = author;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getArticleContext() {
		return articleContext;
	}

	public void setArticleContext(String articleContext) {
		this.articleContext = articleContext;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
