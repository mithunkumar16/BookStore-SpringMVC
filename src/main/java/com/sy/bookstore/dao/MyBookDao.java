package com.sy.bookstore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sy.bookstore.dto.MyBook;
import com.sy.bookstore.repos.MyBookRepos;

@Repository
public class MyBookDao {
	
	@Autowired
	MyBookRepos repos;
	
	public void saveMyBook(MyBook myBook) {
		repos.save(myBook);
	}
	
	public List<MyBook> getMyAllBook() {
		return repos.findAll();
	}
	public void deleteMyBook(int id) {
		repos.deleteById(id);
	}
}
