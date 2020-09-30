package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.service.AuthorService;
import com.spring.boot.service.model.AuthorContext;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	/*Long olarak değiş*/
	
	/*@RequestMapping(value = "/new", method = RequestMethod.POST)
	public Long  save(@RequestBody AuthorContext authorContext) {

		return authorService.save(authorContext);

	}*/

}
