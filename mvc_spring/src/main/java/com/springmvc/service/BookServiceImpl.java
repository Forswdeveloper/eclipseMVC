package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBookList() throws Exception {
		return bookRepository.getAllBookList();
	}

	@Override
	public List<Book> getBookListByCategory(String category) throws Exception {
		return bookRepository.getBookListByCategory(category);
	}

	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) throws Exception {
		return bookRepository.getBookListByFilter(filter);
	}

	@Override
	public Book getBookById(String bookId) throws Exception {
		return bookRepository.getBookById(bookId);
	}

}
