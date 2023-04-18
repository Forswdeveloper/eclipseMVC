package com.springmvc.service;

import java.util.List;

import com.springmvc.domain.Book;

public interface BookService {
	List<Book> getAllBookList() throws Exception;
	List<Book> getBookListByCategory(String category) throws Exception;
}
