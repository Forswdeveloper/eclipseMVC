package com.springmvc.repository;

import java.util.List;

import com.springmvc.domain.Book;

public interface BookRepository {
	List<Book> getAllBookList() throws Exception;
	List<Book> getBookListByCategory(String category) throws Exception;
}
