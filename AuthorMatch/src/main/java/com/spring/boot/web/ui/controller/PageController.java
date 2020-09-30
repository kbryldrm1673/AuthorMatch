package com.spring.boot.web.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.dao.entity.Author;
import com.spring.boot.service.AuthorService;
import com.spring.boot.service.model.AuthorContext;

@Controller
@RequestMapping("/pages")
public class PageController {

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/x", method = RequestMethod.GET)
	public String getSavePage(AuthorContext authorContext) {
		
		return "new_author";
	}
	
	@RequestMapping(value = "/x", method = RequestMethod.POST)
    public String save(AuthorContext authorContext, BindingResult result, Model model) {
        
		authorService.save(authorContext);
        
        return "new_author";
    }
}
