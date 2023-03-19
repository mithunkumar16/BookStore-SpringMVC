package com.sy.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.bookstore.dao.MyBookDao;
import com.sy.bookstore.dto.MyBook;

@Service
public class MyBookService {
	
	@Autowired
	MyBookDao myBookDao;
	
	public void saveMyBook(MyBook myBook) {
		myBookDao.saveMyBook(myBook);
	}
	public List<MyBook> getMyAllBook() {
		return myBookDao.getMyAllBook();
	}
	
	public void deleteMyBook(int id) {
		myBookDao.deleteMyBook(id);
	}
}
