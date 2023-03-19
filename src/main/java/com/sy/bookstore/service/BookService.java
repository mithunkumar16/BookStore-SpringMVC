package com.sy.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.bookstore.dao.BookDao;
import com.sy.bookstore.dto.Book;

@Service
public class BookService {

	@Autowired
	BookDao dao;
	
	public void saveBook(Book book) {
		dao.saveBook(book);
	}
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}
	public void deleteBook(int id) {
		dao.deleteBook(id);
	}
}
