package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Book;

public interface BookService {
	List<Book> getAllBookList() throws Exception;
	List<Book> getBookListByCategory(String category) throws Exception;
	Set<Book> getBookListByFilter(Map<String, List<String>> filter) throws Exception;
	Book getBookById(String bookId) throws Exception;
}
