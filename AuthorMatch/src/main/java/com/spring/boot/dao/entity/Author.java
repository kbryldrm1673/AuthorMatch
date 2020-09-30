package com.spring.boot.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "author")
public class Author implements Serializable {

	private static final long serialVersionUID = 8520593934714063337L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "author_id")
	private Long authorId;

	@Column(name = "author_name")
	private String authorName;

	// @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch =
	// FetchType.LAZY)
	@OneToMany(mappedBy = "author")
	private List<Article> article;

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

}