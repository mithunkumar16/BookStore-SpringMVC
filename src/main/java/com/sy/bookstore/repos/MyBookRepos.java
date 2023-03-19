package com.sy.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sy.bookstore.dto.MyBook;

public interface MyBookRepos extends JpaRepository<MyBook, Integer>{

}
