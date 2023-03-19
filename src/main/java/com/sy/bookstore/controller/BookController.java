package com.sy.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sy.bookstore.dto.Book;
import com.sy.bookstore.dto.MyBook;
import com.sy.bookstore.service.BookService;
import com.sy.bookstore.service.MyBookService;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@Autowired
	MyBookService myBookService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/addbook")
	public String addBook() {
		return "addbook";
	}
	
	@GetMapping("/availablebook")
	public ModelAndView getAllBook(){
		List<Book> books =service.getAllBooks();
		ModelAndView modelAndView=new ModelAndView("availablebook","book",books);
		return modelAndView;
	}
	
	@GetMapping("/myallbook")
	public String getMyAllBook(Model model){
		List<MyBook> mybooks=myBookService.getMyAllBook();
		model.addAttribute("book",mybooks);
		return "mybook";
	}
	
	@PostMapping("/saveBook")
	public String name(@ModelAttribute Book book) {
		service.saveBook(book);
		return "redirect:/availablebook";
	}
	
	@RequestMapping("/myallbook/{id}")
	public String getMyBook(@PathVariable("id") int id) {
		Book book=service.getBookById(id);
		MyBook myBook=new MyBook(book.getId(),book.getName(),book.getAuthor(),book.getPrice());
		myBookService.saveMyBook(myBook);
		
		return "redirect:/myallbook";
	}
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		service.deleteBook(id);
		return "redirect:/availablebook";
	}
	
	@RequestMapping("/updateBook/{id}")
	public String upadteBook(@PathVariable("id") int id , Model model) {
		Book book=service.getBookById(id);
		model.addAttribute("book",book);
		return "updateBook";
	}
}
