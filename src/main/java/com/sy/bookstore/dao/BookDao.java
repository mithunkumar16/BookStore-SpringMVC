package com.sy.bookstore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sy.bookstore.dto.Book;
import com.sy.bookstore.repos.BookRepos;

@Repository
public class BookDao {
	
	@Autowired
	BookRepos repos;
	
	public void saveBook(Book book) {
		repos.save(book);
	}
	
	public List<Book> getAllBooks() {
		return repos.findAll();
	}
	public Book getBookById(int id) {
		return repos.findById(id).get();
	}
	public void deleteBook(int id) {
		repos.deleteById(id);
	}
	
}
