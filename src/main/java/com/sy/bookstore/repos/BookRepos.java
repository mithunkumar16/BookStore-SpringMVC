package com.sy.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sy.bookstore.dto.Book;

public interface BookRepos extends JpaRepository<Book, Integer>{
	
}
