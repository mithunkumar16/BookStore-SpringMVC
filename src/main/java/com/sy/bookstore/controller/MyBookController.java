package com.sy.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.bookstore.service.MyBookService;

@Controller
public class MyBookController {
	
	@Autowired
	MyBookService myBookService;
	
	
	@RequestMapping("/deleteMyBook/{id}")
	public String deleteMyBook(@PathVariable("id") int id) {
		myBookService.deleteMyBook(id);
		return "redirect:/myallbook";
	}
}
