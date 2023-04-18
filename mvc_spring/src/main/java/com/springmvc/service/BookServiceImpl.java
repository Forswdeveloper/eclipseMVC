package com.springmvc.service;

import java.util.List;

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

}
