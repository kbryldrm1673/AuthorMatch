package com.spring.boot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue
	@Column(name = "article_id")
	private Long articleID;
	
	@Column(name = "article")
	private String articleContent;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name = "author_id", insertable = false, updatable = false)
	private Author author;

	public Long getArticleID() {
		return articleID;
	}

	public void setArticleID(Long articleID) {
		this.articleID = articleID;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
	

	
	
}
