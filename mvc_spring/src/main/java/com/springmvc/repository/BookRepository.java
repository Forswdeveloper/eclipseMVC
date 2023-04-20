package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Book;

public interface BookRepository {
	List<Book> getAllBookList() throws Exception;
	List<Book> getBookListByCategory(String category) throws Exception;
	Set<Book> getBookListByFilter(Map<String, List<String>> filter) throws Exception;
	Book getBookById(String bookId) throws Exception;
	void setNewBook(Book book) throws Exception;
}
