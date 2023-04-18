package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public String requestBookList(Model model) throws Exception{
		List<Book> list = bookService.getAllBookList();
		model.addAttribute("bookList",list);
		return "books";
	}
	
	//메소드형 RequestMapping GetMapping,PostMapping,PutMapping,DeleteMapping,PatchMapping
	// RequestMapping(value="/all", method = "RequestMethod.GET") 과 같다.
	@GetMapping("/all") 
	public String requestAllBooks(Model model) throws Exception{
		List<Book> list = bookService.getAllBookList();
		model.addAttribute("bookList",list);
		return "books";
	}
	
	@GetMapping("/allMAV")
	public ModelAndView requestMavAllbooks() throws Exception{
		ModelAndView mav = new ModelAndView();
		
		List<Book> list = bookService.getAllBookList();
		
		mav.addObject("bookList",list);
		
		mav.setViewName("books");
		return mav;
	}
	
	//경로변수의 사용 PathVariable : 경로변수의 값을 요청 처리 메서드의 매개변수로 전달 받음.
	@GetMapping("/{category}")
	public String requsetBooksByCategory(@PathVariable("category") String bookCategory, Model model) throws Exception{
		List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
		
		model.addAttribute("bookList", booksByCategory);
		
		return "books";
	}
	
	
}
