package com.springmvc.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/filter/{bookFilter}")
	public String requestBooksByFilter(
			@MatrixVariable(pathVar="bookFilter") Map<String,List<String>> bookFilter,
			Model model) throws Exception{
		
		Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
		model.addAttribute("bookList", booksByFilter);
		
		return "books";
	}
	
	@GetMapping("/book")
	public String requsetBookById(@RequestParam("id") String bookId, Model model) throws Exception{
		Book bookById = bookService.getBookById(bookId);
		model.addAttribute("book", bookById);
		return "book";
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.GET)
	public String requsetAddBookForm(@ModelAttribute("NewBook") Book book) throws Exception {
		return "addBook";
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String submitAddNewBook(@ModelAttribute("NewBook") Book book) throws Exception {
		bookService.setNewBook(book);
		//redirect는 시스템적으로 변화가 일어날 때 사용하는 뷰 리다이렉션
		//forward는 시스템적으로 변화가 일어나지 않는 단순 조회 요청을 할 때 사용
		return "redirect:/books";
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("addTitle","신규 도서 등록");
	}
	
	@InitBinder
	public void initBiner(WebDataBinder binder) {
		binder.setAllowedFields("bookId", "name","unitPrice","author","description","publisher","category"
				,"unitInStock","totalPages","releaseDate","condition");
	}
}
